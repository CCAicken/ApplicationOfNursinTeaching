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
import Model.TDailyLife;
import Model.VDailyLife;
import business.Impl.DailyLifeImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "dailylife")
public class DailyLifeController {
	/**
	 * 添加日常生活
	 * 
	 * @param dietAndNutritionType
	 * @param eliminationPatternType
	 * @param restAndSleepType
	 * @param dailyActivities
	 * @param selfCare
	 * @param personaHobbies
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "insertdl")
	public void addDailyLife(String dietAndNutritionType,
			String eliminationPatternType, String restAndSleepType,
			String dailyActivities, String selfCare, String personaHobbies,
			int patId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DailyLifeImpl dao = new DailyLifeImpl();
		TDailyLife tdl = new TDailyLife();
		tdl.setDailyActivities(dailyActivities);
		tdl.setDietAndNutritionType(dietAndNutritionType);
		tdl.setEliminationPatternType(eliminationPatternType);
		tdl.setPatId(patId);
		tdl.setPersonaHobbies(personaHobbies);
		tdl.setRestAndSleepType(restAndSleepType);
		tdl.setSelfCare(selfCare);
		LayuiData laydata = new LayuiData();
		TDailyLife istdl = dao.isExit(patId);
		if (istdl != null && !istdl.equals("")) {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "该病人已有日常生活记录";
		} else {
			boolean count = dao.Insert(tdl);
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

	/**
	 * 编辑日常生活
	 * 
	 * @param daliyId
	 * @param dietAndNutritionType
	 * @param eliminationPatternType
	 * @param restAndSleepType
	 * @param dailyActivities
	 * @param selfCare
	 * @param personaHobbies
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "edittdl")
	public void editDailyLife(int daliyId, String dietAndNutritionType,
			String eliminationPatternType, String restAndSleepType,
			String dailyActivities, String selfCare, String personaHobbies,
			int patId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DailyLifeImpl dao = new DailyLifeImpl();
		TDailyLife tdl = new TDailyLife();
		tdl.setDailyId(daliyId);
		tdl.setDailyActivities(dailyActivities);
		tdl.setDietAndNutritionType(dietAndNutritionType);
		tdl.setEliminationPatternType(eliminationPatternType);
		tdl.setPatId(patId);
		tdl.setPersonaHobbies(personaHobbies);
		tdl.setRestAndSleepType(restAndSleepType);
		tdl.setSelfCare(selfCare);
		boolean count = dao.update(tdl);
		LayuiData laydata = new LayuiData();
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

	/**
	 * 删除日常生活
	 * 
	 * @param daliyId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "deltdl")
	public void delDailyLife(int daliyId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DailyLifeImpl dao = new DailyLifeImpl();
		boolean count = dao.delete(daliyId);
		LayuiData laydata = new LayuiData();
		if (count) {
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
	 * 分页查询日常生活
	 * 
	 * @param patName
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getdlpage")
	public void getDLPage(String patName, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		DailyLifeImpl dao = new DailyLifeImpl();
		Expression exp = new Expression();
		if (patName != null && !patName.equals("")) {
			exp.andLike("patName", patName, String.class);
		}
		String opration = exp.toString();
		List<VDailyLife> list = dao.getVMainSuitByLike(opration, page, limit);
		int count = dao.getVMainSuitAmount(opration);
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
