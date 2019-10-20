package controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.Expression;
import util.LayuiData;
import Model.TCheck;
import Model.VCheck;
import business.Impl.CheckImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "check")
public class CheckController {
	@RequestMapping(value = "insert")
	public void insert(String checkItem, String checkTheResult, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		CheckImpl cdao = new CheckImpl();
		TCheck check = new TCheck();
		check.setCheckItem(checkItem);
		check.setCheckTheResult(checkTheResult);
		check.setPatientId(patId);

		LayuiData laydata = new LayuiData();
		TCheck ck = cdao.isExit(patId);
		if (ck != null && !ck.equals("")) {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "该病人已有检查项目";
		} else {
			boolean count = cdao.Insert(check);
			if (count) {
				laydata.code = LayuiData.SUCCESS;
				laydata.msg = "添加成功";
			} else {
				laydata.code = LayuiData.ERRR;
				laydata.msg = "添加失败";
			}
		}
		Writer out;
		try {
			out = response.getWriter();
			out.write(JSON.toJSONString(laydata));
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "edit")
	public void update(int checkId, String checkItem, String checkTheResult,
			int patId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		CheckImpl cdao = new CheckImpl();
		TCheck check = cdao.select(checkId);
		check.setCheckId(checkId);
		check.setCheckItem(checkItem);
		check.setCheckTheResult(checkTheResult);
		check.setPatientId(patId);

		LayuiData laydata = new LayuiData();
		boolean count = cdao.update(check);
		if (count) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "编辑成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "编辑失败";
		}

		Writer out;
		try {
			out = response.getWriter();
			out.write(JSON.toJSONString(laydata));
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "delete")
	public void delete(int checkId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		CheckImpl cdao = new CheckImpl();

		boolean result = cdao.delete(checkId);
		LayuiData laydata = new LayuiData();
		if (result) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "删除成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "删除失败";
		}

		Writer out;
		try {
			out = response.getWriter();
			out.write(JSON.toJSONString(laydata));
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "select")
	public void select(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		CheckImpl cdao = new CheckImpl();

		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.andLike("patName", strwhere, String.class);
		}
		String opration = exp.toString();
		List<VCheck> list = cdao.getVCheckByLike(opration, page, limit);
		int count = cdao.getVCheckAmount(opration);
		LayuiData laydata = new LayuiData();
		if (list != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
			laydata.count = count;
			laydata.data = list;
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "查询失败";
		}
		Writer out;
		try {
			out = response.getWriter();
			out.write(JSON.toJSONString(laydata));
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
