package controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.LayuiData;
import Model.TDepartment;
import business.DAO.DepartmentDAO;
import business.Impl.DepartmentImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "dep")
public class DepartmentController {
	@RequestMapping(value = "getdepbyid")
	public void getdepbyid(Integer depId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DepartmentDAO mdao = new DepartmentImpl();
		TDepartment department = mdao.select(depId);
		LayuiData laydata = new LayuiData();
		if (department != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
			laydata.data = department;
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

	@RequestMapping(value = "getalldep")
	public void getAllDep(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DepartmentDAO mdao = new DepartmentImpl();
		List<TDepartment> list = mdao.select();
		LayuiData laydata = new LayuiData();
		if (list != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
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
