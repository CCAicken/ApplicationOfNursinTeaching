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
import Model.TMainSuit;
import Model.TPatient;
import Model.VMainSuit;
import Model.VPatient;
import business.Impl.MainSuitImpl;
import business.Impl.PatientImpl;

import com.alibaba.fastjson.JSON;

/**
 * 病人基础信息控制类
 * 
 * @author Aicken
 *
 */
@Controller
@RequestMapping(value = "patient")
public class PatientController {

	/**
	 * 获取所有病人信息
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "allpat")
	public void getAllPat(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PatientImpl pdao = new PatientImpl();
		List<VPatient> list = pdao.getAllPat();
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
	 * 添加病人
	 * 
	 * @param patName
	 * @param profession
	 * @param agend
	 * @param age
	 * @param origin
	 * @param nation
	 * @param beHospitalizedTime
	 * @param degreeOfEducation
	 * @param address
	 * @param religiousBelief
	 * @param remarks
	 * @param marriageStatus
	 * @param depId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addpat")
	public void addPat(String patName, String profession, String agend,
			Integer age, String origin, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, String remarks,
			String marriageStatus, Integer depId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PatientImpl pdao = new PatientImpl();
		TPatient p = new TPatient();
		p.setAddress(address);
		p.setAge(age);
		p.setAgend(agend);
		p.setBeHospitalizedTime(beHospitalizedTime);
		p.setDegreeOfEducation(degreeOfEducation);
		p.setDepId(depId);
		p.setMarriageStatus(marriageStatus);
		p.setNation(nation);
		p.setOrigin(origin);
		p.setPatName(patName);
		p.setProfession(profession);
		p.setReligiousBelief(religiousBelief);
		p.setRemarks(remarks);
		int count = pdao.addPat(p);
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
	 * 编辑病人
	 * 
	 * @param patId
	 * @param patName
	 * @param profession
	 * @param agend
	 * @param age
	 * @param origin
	 * @param nation
	 * @param beHospitalizedTime
	 * @param degreeOfEducation
	 * @param address
	 * @param religiousBelief
	 * @param remarks
	 * @param marriageStatus
	 * @param depId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "editpat")
	public void editPat(int patId, String patName, String profession,
			String agend, int age, String origin, String nation,
			String beHospitalizedTime, String degreeOfEducation,
			String address, String religiousBelief, String remarks,
			String marriageStatus, int depId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PatientImpl pdao = new PatientImpl();
		TPatient p = new TPatient();
		p.setPatId(patId);
		p.setAddress(address);
		p.setAge(age);
		p.setAgend(agend);
		p.setBeHospitalizedTime(beHospitalizedTime);
		p.setDegreeOfEducation(degreeOfEducation);
		p.setDepId(depId);
		p.setMarriageStatus(marriageStatus);
		p.setNation(nation);
		p.setOrigin(origin);
		p.setPatName(patName);
		p.setProfession(profession);
		p.setReligiousBelief(religiousBelief);
		p.setRemarks(remarks);
		boolean result = pdao.editPat(p);
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
	 * 删除病人
	 * 
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "delpat")
	public void delPat(int patId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PatientImpl pdao = new PatientImpl();
		boolean result = pdao.delPat(patId);
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

	@RequestMapping(value = "getpatpage")
	public void getPatPage(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PatientImpl pdao = new PatientImpl();

		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.andLike("patName", strwhere, String.class);
			exp.orEqu("depId", strwhere, Integer.class);
			exp.orEqu("patName", strwhere, String.class);
		}
		String opration = exp.toString();
		List<VPatient> list = pdao.getPatByPageForV(opration, page, limit);
		int count = pdao.getPatCountForV(opration);
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
	 * 添加主诉
	 * 
	 * @param patName
	 * @param symptom
	 * @param nature
	 * @param lengthOfTime
	 * @param degree
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addms")
	public void insertMS(String patName, String symptom, String nature,
			String lengthOfTime, String degree, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		MainSuitImpl mdao = new MainSuitImpl();
		TMainSuit ms = new TMainSuit();
		ms.setDegree(degree);
		ms.setLengthOfTime(lengthOfTime);
		ms.setNature(nature);
		ms.setSymptom(symptom);
		ms.setPatId(patId);
		int count = mdao.addMainSuit(ms);
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
	 * 编辑主诉
	 * 
	 * @param patName
	 * @param symptom
	 * @param nature
	 * @param lengthOfTime
	 * @param degree
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "editms")
	public void editMS(int msId, String patName, String symptom, String nature,
			String lengthOfTime, String degree, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		MainSuitImpl mdao = new MainSuitImpl();
		TMainSuit ms = new TMainSuit();
		ms.setDegree(degree);
		ms.setLengthOfTime(lengthOfTime);
		ms.setNature(nature);
		ms.setSymptom(symptom);
		ms.setPatId(patId);
		ms.setMainSuitId(msId);
		boolean result = mdao.editMainSuit(ms);
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

	@RequestMapping(value = "deltms")
	public void editMS(Integer msId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		MainSuitImpl mdao = new MainSuitImpl();
		LayuiData laydata = new LayuiData();
		if (mdao.delMainSuit(msId)) {
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
	 * 分页查询主诉
	 * 
	 * @param patName
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "getmspage")
	public void getMSPage(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		MainSuitImpl mdao = new MainSuitImpl();
		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.andLike("patName", strwhere, String.class);
		}
		String opration = exp.toString();
		List<VMainSuit> list = mdao.selMsByPage(opration, page, limit);
		int count = mdao.getMsCoun(opration);
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
