
package com.jzt.api.controller;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.P2pLoan;
import com.jzt.api.service.P2pLoanService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * P2p标的接口
 * jzt-web后台 增删改查
 */

@Controller
@RequestMapping("/rest/{version}/p2ploan")
public class P2pLoanController extends BaseController {

    @Autowired
    private P2pLoanService p2pLoanService;

    /***
     * p2p标的列表
     * @param startRow   起始页码
     * @param pageSize   显示多少结果
     * @return
     */
    @RequestMapping(value = "/list/{startRow}/{pageSize}")
    @ResponseBody
    public Map<String, Object> list(@PathVariable(value = "startRow") int startRow,
                                    @PathVariable(value = "pageSize") int pageSize) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            P2pLoan p2pLoan = new P2pLoan();
            p2pLoan.setStartRow(startRow);
            p2pLoan.setPageSize(pageSize);
            List<Map> list = p2pLoanService.list(p2pLoan);

            data.put("p2ploan", list);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

    /***
     * 删除p2p标的
     * @param nid   p2p标的id
     * @return
     */
    @RequestMapping(value = "/delete/{nid}")
    @ResponseBody
    public Map<String, Object> delete(@PathVariable(value = "nid") int nid) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            P2pLoan p2pLoan = new P2pLoan();
            p2pLoan.setId(nid);
            p2pLoanService.delete(p2pLoan);

            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

    /***
     * 查询p2p标的具体信息
     * @param id： 标的id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable(value = "id") int id) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            Map record = p2pLoanService.get(id);

            data.put("p2ploan", record);
            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

    /***
     * 编辑p2p标的
     * @param para： 修改后的标的内容
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/edit/")
    @ResponseBody
    public Map<String, Object> edit(@RequestParam(value = "para", required = true) String para) {

        Map<String, Object> result = new HashMap<String, Object>();
        JSONObject jsStr = JSONObject.fromObject(para);
        P2pLoan dto = (P2pLoan) JSONObject.toBean(jsStr, P2pLoan.class);

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            p2pLoanService.update(dto);

            result.put("data", data);
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-" + e.getMessage());
        }

        return result;
    }

    /***
     * 新增标的
     * @param  para
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/add/")
    @ResponseBody
    public Map<String, Object> add(@RequestParam(value = "para", required = true) String para) {
        JSONObject jsStr = JSONObject.fromObject(para);
        P2pLoan dto = (P2pLoan) JSONObject.toBean(jsStr, P2pLoan.class);

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();
            p2pLoanService.add(dto);
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