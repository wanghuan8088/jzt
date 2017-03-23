package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.RankBankData;
import com.jzt.api.service.RankBankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  金融新榜-银行系平台
 */

@Controller
@RequestMapping("/rest/{version}/rank")
public class RankBankController extends BaseController {


	@Autowired
	RankBankService rankBankService;

    /**
     * 能力排行
     * @param type   银行系平台类型
     * @param order   排序(综合性理财能力/发行能力/收益能力/风控能力/产品丰富性能力)
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/bank/{type}/{order}/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> turnover(@PathVariable(value="type") int type,
                                        @PathVariable(value="order") int order,
                                        @PathVariable(value="startRow") int startRow,
                                        @PathVariable(value="pageSize") int pageSize){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            // TODO: 19/03/2017
            // liaokaihong 20170323
            
            String order_field = "";//排序字段
            if(order==1)
            {
            	order_field = "total_score";
            }
            else if(order==2)
            {
            	order_field = "profit_score";
            }
            else if(order==3)
            {
            	order_field = "release_score";
            }
            else if(order==4)
            {
            	order_field = "risk_score";
            }
            else 
            {
            	order_field = "product_rich_score";
			}
            
            List<RankBankData> list= rankBankService.selectRankBankByType(type, order_field, startRow, pageSize);  
            data.put("platform", list);
            
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }
}
