package controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.Expression;
import util.LayuiData;
import Model.TStudent;
import Model.TTeacher;
import Model.VStudent;
import Model.VTeacher;
import business.Impl.StudentImpl;
import business.Impl.TeacherImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "user")
public class UserController {
	/**
	 * 学生用户登录
	 * 
	 * @param stuId
	 * @param stuPwd
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "stulogin")
	public void stuLogin(String stuId, String stuPwd,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		StudentImpl studao = new StudentImpl();
		TStudent stu = studao.stuLogin(stuId, stuPwd);
		LayuiData laydata = new LayuiData();
		if (stu != null && !stu.equals("")) {
			HttpSession session = request.getSession();
			session.setAttribute("student", stu);
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "登录成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "登录失败";
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
	 * 添加学生
	 * 
	 * @param stuId
	 * @param stuName
	 * @param stuPwd
	 * @param classId
	 * @param stuAgend
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addstu")
	public void addStu(String stuId, String stuName, String stuPwd,
			int classId, String stuAgend, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		TStudent stu = new TStudent();
		stu.setStuId(stuId);
		stu.setStuName(stuName);
		stu.setStupwd(stuPwd);
		stu.setClassId(classId);
		stu.setAgend(stuAgend);
		LayuiData laydata = new LayuiData();
		VStudent selStu = studao.getStuByStuId(stuId);
		if (selStu != null && !selStu.getStuId().equals("")) {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "该账号已存在";
		} else {
			int count = studao.addStu(stu);
			if (count > 0) {
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

	/**
	 * 删除学生
	 * 
	 * @param stuId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "delstu")
	public void delStu(String stuId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		boolean result = studao.delStu(stuId);
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

	/**
	 * 编辑学生信息
	 * 
	 * @param stuId
	 * @param stuName
	 * @param stuPwd
	 * @param classId
	 * @param stuAgend
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "edtistu")
	public void edtiStu(String stuId, String stuName, String stuPwd,
			int classId, String stuAgend, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		TStudent stu = new TStudent();
		stu.setStuId(stuId);
		stu.setStuName(stuName);
		stu.setStupwd(stuPwd);
		stu.setClassId(classId);
		stu.setAgend(stuAgend);
		boolean result = studao.editStu(stu);
		LayuiData laydata = new LayuiData();
		if (result) {
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
	 * 修改学生密码
	 * 
	 * @param stuId
	 * @param stuPwd
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "changestupwd")
	public void changeStuPwd(String stuId, String stuPwd,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		StudentImpl studao = new StudentImpl();
		TStudent student = studao.getStuFromTStu(stuId);
		student.setStupwd(stuPwd);
		boolean result = studao.editStu(student);
		LayuiData laydata = new LayuiData();
		if (result) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "修改成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "修改失败";
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
	 * 获取所有学生
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getallstu")
	public void getAllStu(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		List<VStudent> list = studao.getAllStu();
		LayuiData laydata = new LayuiData();
		laydata.code = LayuiData.SUCCESS;
		laydata.data = list;
		laydata.msg = "查询成功";
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
	 * 根据班级获取学生
	 * 
	 * @param classId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getstubyclass")
	public void getStuByClassId(int classId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		List<VStudent> list = studao.getStuByClassId(classId);
		LayuiData laydata = new LayuiData();
		laydata.code = LayuiData.SUCCESS;
		laydata.data = list;
		laydata.msg = "查询成功";
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
	 * 根据学生账号获取学生信息
	 * 
	 * @param stuId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getstubystuId")
	public void getStuByStuId(String stuId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		StudentImpl studao = new StudentImpl();
		VStudent stu = studao.getStuByStuId(stuId);
		LayuiData laydata = new LayuiData();
		laydata.code = LayuiData.SUCCESS;
		laydata.data = stu;
		laydata.msg = "查询成功";
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
	 * 分页查询学生信息
	 * 
	 * @param strwhere
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "selstubypage")
	public void selStuByPage(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		StudentImpl studao = new StudentImpl();

		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.orLike("stuId", strwhere, String.class);
			exp.orLike("className", strwhere, String.class);
			exp.orLike("stuName", strwhere, String.class);
		}
		String opration = exp.toString();
		int count = studao.getStuCount(opration);
		List<VStudent> list = studao.selStuByPage(opration, page, limit);
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

	/**
	 * 教师登录
	 * 
	 * @param teaId
	 * @param teaPwd
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "tealogin")
	public void teaLogin(String teaId, String teaPwd,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		TeacherImpl teadao = new TeacherImpl();
		TTeacher teacher = teadao.teaLogin(teaId, teaPwd);
		LayuiData laydata = new LayuiData();
		if (teacher != null && !teacher.equals("")) {
			HttpSession session = request.getSession();
			session.setAttribute("teacher", teacher);
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "登录成功";
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.data = null;
			laydata.msg = "登录失败";
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
	 * 添加教师
	 * 
	 * @param teaId
	 * @param teaPwd
	 * @param teaName
	 * @param agend
	 * @param jobTitle
	 * @param userType
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addtea")
	public void addTea(String teaId, String teaPwd, String teaName,
			String agend, String jobTitle, int userType,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		TeacherImpl teadao = new TeacherImpl();
		TTeacher tea = new TTeacher();
		tea.setTeaId(teaId);
		tea.setTeaName(teaName);
		tea.setTeapwd(teaPwd);
		tea.setAgend(agend);
		tea.setJobTitle(jobTitle);
		tea.setUserType(userType);
		int count = teadao.addTeacher(tea);
		LayuiData laydata = new LayuiData();
		VTeacher teacher = teadao.getTeaById(teaId);
		if (teacher != null && !teacher.getTeaId().equals("")) {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "该账号已存在";
		} else {
			if (count > 0) {
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

	/**
	 * 编辑教师
	 * 
	 * @param teaId
	 * @param teaPwd
	 * @param teaName
	 * @param agend
	 * @param jobTitle
	 * @param userType
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "edittea")
	public void editTea(String teaId, String teaPwd, String teaName,
			String agend, String jobTitle, int userType,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		TeacherImpl teadao = new TeacherImpl();
		TTeacher tea = teadao.getTeaFromTTea(teaId);
		tea.setTeaName(teaName);
		tea.setAgend(agend);
		tea.setJobTitle(jobTitle);
		tea.setUserType(userType);
		tea.setTeapwd(teaPwd);
		boolean result = teadao.editTeacher(tea);
		LayuiData laydata = new LayuiData();
		if (result) {
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
	 * 删除教师信息
	 * 
	 * @param teaId
	 * @param teaPwd
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "deltea")
	public void delTea(String teaId, String teaPwd, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		TeacherImpl teadao = new TeacherImpl();
		boolean result = teadao.delTeacher(teaId);
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

	/**
	 * 获取所有教师用户
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "gettea")
	public void getTea(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		TeacherImpl teadao = new TeacherImpl();
		List<VTeacher> list = teadao.getAllTea();
		LayuiData laydata = new LayuiData();
		laydata.code = LayuiData.SUCCESS;
		laydata.data = list;
		laydata.msg = "查询成功";
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
	 * 根据账号获取教师信息
	 * 
	 * @param teaId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getteaid")
	public void getByGrade(String teaId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		TeacherImpl teadao = new TeacherImpl();
		VTeacher tea = teadao.getTeaById(teaId);
		LayuiData laydata = new LayuiData();
		laydata.code = LayuiData.SUCCESS;
		laydata.data = tea;
		laydata.msg = "查询成功";
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

	@RequestMapping(value = "getteaBypage")
	public void getTeaByPage(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		TeacherImpl teadao = new TeacherImpl();

		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.orLike("teaName", strwhere, String.class);
			exp.orLike("teaPhoto", strwhere, String.class);
			exp.orLike("teaId", strwhere, String.class);
		}
		String wherecondition = exp.toString();
		int count = teadao.getTeaCount(wherecondition);
		List<VTeacher> list = teadao.selByPage(wherecondition, page, limit);
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
