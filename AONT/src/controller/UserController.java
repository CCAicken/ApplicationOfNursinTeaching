package controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping(value = "stuLogin")
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
	@RequestMapping(value = "addStu")
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
	@RequestMapping(value = "delStu")
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
	@RequestMapping(value = "edtiStu")
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
	@RequestMapping(value = "changeStuPwd")
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
	 * 教师登录
	 * 
	 * @param teaId
	 * @param teaPwd
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "teaLogin")
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
	@RequestMapping(value = "addTea")
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
	@RequestMapping(value = "editTea")
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
	@RequestMapping(value = "delTea")
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
}