package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.Expression;
import util.LayuiData;
import Model.TClass;
import Model.TGrade;
import Model.VClass;
import business.DAO.ClassDAO;
import business.DAO.GradeDAO;
import business.Impl.ClassImpl;
import business.Impl.GradeImpl;

import com.alibaba.fastjson.JSON;

/**
 * 班级年级基础信息控制类
 * 
 * @author Aicken
 *
 */
@Controller
@RequestMapping(value = "basicinfo")
public class BasicInfoController {
	/**
	 * 查询班级
	 * 
	 * @param request
	 * @param page
	 *            当前页
	 * @param limit
	 *            每页数量
	 * @param classname
	 *            班级名称
	 * @param gradeName
	 *            年级名称
	 * @param response
	 * @param model
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "getclass", produces = {
			"text/html;charset=UTF-8;", "application/json;" })
	public void getAllClass(HttpServletRequest request, int page, int limit,
			String classname, String gradeName, HttpServletResponse response,
			Model model) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		ClassDAO cdao = new ClassImpl();
		// 查询条件
		Expression exp = new Expression();

		if (classname != null && !classname.equals("")) {

			exp.andEqu("className", classname, String.class);
		}
		if (gradeName != null && !gradeName.equals("")) {
			exp.andEqu("gradeName", gradeName, String.class);
		}

		String opreation = exp.toString();
		// System.out.println(opreation);
		int allcount = cdao.getVClassAmount(opreation);
		List<VClass> vClasses = cdao.getVClassByLike(opreation, page, limit);
		LayuiData laydata = new LayuiData();
		if (vClasses != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
			laydata.count = allcount;
			laydata.data = vClasses;
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

	/**
	 * 添加班级
	 * 
	 * @param request
	 * @param response
	 * @param className
	 *            班级名称
	 * @param teaId
	 *            班主任id
	 * @param gradeId
	 *            年级id
	 * @param model
	 */
	@RequestMapping(value = "addclass")
	public void addClass(HttpServletRequest request,
			HttpServletResponse response, String className, String teaId,
			Integer gradeId, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		ClassDAO cdao = new ClassImpl();

		TClass newclass = new TClass();
		newclass.setClassName(className);
		newclass.setTeaId(teaId);
		newclass.setGradeId(gradeId);
		LayuiData laydata = new LayuiData();
		if (cdao.Insert(newclass)) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "添加成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "添加失败";
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

	/**
	 * 编辑班级
	 * 
	 * @param request
	 * @param response
	 * @param classId
	 *            班级id
	 * @param className
	 *            班级名称
	 * @param teaId
	 *            班主任id
	 * @param gradeId
	 *            年纪id
	 * @param model
	 */
	@RequestMapping(value = "editclass")
	public void editClass(HttpServletRequest request,
			HttpServletResponse response, Integer classId, String className,
			String teaId, Integer gradeId, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		ClassDAO cdao = new ClassImpl();

		TClass oldclass = new TClass();
		oldclass.setClassId(classId);
		oldclass.setClassName(className);
		oldclass.setTeaId(teaId);
		oldclass.setGradeId(gradeId);
		LayuiData laydata = new LayuiData();
		if (cdao.update(oldclass)) {
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

	/**
	 * 删除班级
	 * 
	 * @param request
	 * @param response
	 * @param classId
	 *            班级id
	 * @param model
	 */
	@RequestMapping(value = "delclass")
	public void delClass(HttpServletRequest request,
			HttpServletResponse response, Integer classId, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		ClassDAO cdao = new ClassImpl();

		LayuiData laydata = new LayuiData();
		if (cdao.delete(classId)) {
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

	/**
	 * 获取年级
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getgrade")
	public void getGrade(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		GradeDAO gdao = new GradeImpl();

		List<TGrade> grade = gdao.geTGradeByLike("", 0, 10000);
		LayuiData laydata = new LayuiData();
		if (grade != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
			laydata.data = grade;
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

	/**
	 * 添加年级
	 * 
	 * @param request
	 * @param response
	 * @param gradeName
	 *            年级名称
	 * @param model
	 */
	@RequestMapping(value = "addgrade")
	public void addGrade(HttpServletRequest request,
			HttpServletResponse response, String gradeName, Model model) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		GradeDAO gdao = new GradeImpl();

		TGrade newgrade = new TGrade();
		newgrade.setGradeName(gradeName);
		LayuiData laydata = new LayuiData();
		if (gdao.insert(newgrade)) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "添加成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "添加失败";
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