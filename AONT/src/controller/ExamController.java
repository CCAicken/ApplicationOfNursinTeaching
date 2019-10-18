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
import Model.TAchievement;
import Model.TExam;
import Model.VAchievement;
import Model.VExam;
import business.Impl.AchievementImpl;
import business.Impl.ExamImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "exam")
public class ExamController {
	/**
	 * 添加考试
	 * 
	 * @param examName
	 * @param startTime
	 * @param endTime
	 * @param teaId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addexam")
	public void insertExam(String examName, String startTime, String endTime,
			String teaId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		ExamImpl edao = new ExamImpl();
		TExam ex = new TExam();
		ex.setEndTime(endTime);
		ex.setExamName(examName);
		ex.setStartTime(startTime);
		ex.setTeaId(teaId);
		boolean result = edao.Insert(ex);
		LayuiData laydata = new LayuiData();
		if (result) {
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
	 * 编辑考试
	 * 
	 * @param examName
	 * @param startTime
	 * @param endTime
	 * @param teaId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "editexam")
	public void editExam(int examId, String examName, String startTime,
			String endTime, String teaId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		ExamImpl edao = new ExamImpl();
		TExam ex = edao.select(examId);
		ex.setEndTime(endTime);
		ex.setExamName(examName);
		ex.setStartTime(startTime);
		ex.setTeaId(teaId);
		boolean result = edao.update(ex);
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
	 * 删除考试
	 * 
	 * @param examId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "delexam")
	public void delExam(int examId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		ExamImpl edao = new ExamImpl();
		boolean result = edao.delete(examId);
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
	 * 分页查询考试安排
	 * 
	 * @param patName
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getdlpage")
	public void getDLPage(String teaName, String startTime, String endTime,
			String examName, int page, int limit, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		ExamImpl edao = new ExamImpl();
		Expression exp = new Expression();
		if (teaName != null && !teaName.equals("")) {
			exp.andLike("teaName", teaName, String.class);
		}
		if (examName != null && !examName.equals("")) {
			exp.andLike("examName", examName, String.class);
		}
		if (startTime != null && !startTime.equals("")) {
			// exp.andLike("startTime", startTime, String.class);
			exp.andBetween("startTime", startTime, String.class);
		}
		if (endTime != null && !endTime.equals("")) {
			exp.andAnd(endTime, String.class);
		}
		String opration = exp.toString();
		List<VExam> list = edao.getVExamByLike(opration, page, limit);
		int count = edao.getVExamAmount(opration);
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
	 * 添加成绩
	 * 
	 * @param diagnosisId
	 * @param inquiryScore
	 * @param chechScore
	 * @param ndScore
	 * @param allScore
	 * @param examId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addscore")
	public void insertScore(int diagnosisId, Double inquiryScore,
			Double mdScore, Double chechScore, Double ndScore, Double allScore,
			int examId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		AchievementImpl adao = new AchievementImpl();
		TAchievement am = new TAchievement();
		am.setAllScore(allScore);
		am.setChechScore(chechScore);
		am.setDiagnosisId(diagnosisId);
		am.setExamId(examId);
		am.setInquiryScore(inquiryScore);
		am.setMdScore(mdScore);
		am.setNdScore(ndScore);
		int count = adao.Insert(am);
		LayuiData laydata = new LayuiData();
		if (count > 0) {
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
	 * 分页查询成绩
	 * 
	 * @param stuName
	 * @param examName
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getampage")
	public void selectAMpage(String stuName, String examName, int page,
			int limit, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		AchievementImpl adao = new AchievementImpl();
		Expression exp = new Expression();
		if (stuName != null && !stuName.equals("")) {
			exp.andLike("stuName", stuName, String.class);
		}
		if (examName != null && !examName.equals("")) {
			exp.andLike("examName", examName, String.class);
		}
		String likecondition = exp.toString();
		List<VAchievement> list = adao.getAchievementByLike(likecondition,
				page, limit);
		int count = adao.getAchievementrAmount(likecondition);
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
	 * 根据成绩id获得成绩信息
	 * 
	 * @param achId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getambyid")
	public void getAMById(int achId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		AchievementImpl adao = new AchievementImpl();
		VAchievement am = adao.selectVachievement(achId);
		LayuiData laydata = new LayuiData();
		if (am != null) {
			laydata.code = LayuiData.SUCCESS;
			laydata.msg = "查询成功";
			laydata.data = am;
		} else {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "查询失败";
		}
	}
}
