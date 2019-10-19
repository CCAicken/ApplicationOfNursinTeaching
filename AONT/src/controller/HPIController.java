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
import Model.THPI;
import Model.VMainSuit;
import business.Impl.HPIImpl;
import business.Impl.PatientImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "HPI")
public class HPIController {
	/**
	 * 添加现病史
	 * 
	 * @param onsetCondition
	 * @param pathogeny
	 * @param mainSymptoms
	 * @param accompaniedSymptoms
	 * @param developmentOfIllness
	 * @param treatmentAndNursing
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "addhpi")
	public void addHPI(String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		HPIImpl hdao = new HPIImpl();
		PatientImpl pdao = new PatientImpl();
		THPI hpi = new THPI();
		hpi.setAccompaniedSymptoms(accompaniedSymptoms);
		hpi.setDevelopmentOfIllness(developmentOfIllness);
		hpi.setMainSymptoms(mainSymptoms);
		hpi.setOnsetCondition(onsetCondition);
		hpi.setPathogeny(pathogeny);
		hpi.setPatId(patId);
		hpi.setTreatmentAndNursing(treatmentAndNursing);
		LayuiData laydata = new LayuiData();
		ms = pdao.getPatByPId(patId);
		if (ms != null) {
			laydata.code = LayuiData.ERRR;
			laydata.msg = "该病人已有现病史记录";
		} else {
			int count = hdao.addHPI(hpi);
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
	 * 编辑现病史
	 * 
	 * @param onsetCondition
	 * @param pathogeny
	 * @param mainSymptoms
	 * @param accompaniedSymptoms
	 * @param developmentOfIllness
	 * @param treatmentAndNursing
	 * @param patId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "edithpi")
	public void editHPI(int hpiId, String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		HPIImpl hdao = new HPIImpl();
		THPI hpi = hdao.getByHPIId(hpiId);
		hpi.setAccompaniedSymptoms(accompaniedSymptoms);
		hpi.setDevelopmentOfIllness(developmentOfIllness);
		hpi.setMainSymptoms(mainSymptoms);
		hpi.setOnsetCondition(onsetCondition);
		hpi.setPathogeny(pathogeny);
		hpi.setPatId(patId);
		hpi.setTreatmentAndNursing(treatmentAndNursing);
		boolean result = hdao.editHPI(hpi);
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
	 * 删除现病史
	 * 
	 * @param hpiId
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "delhpi")
	public void delHPI(int hpiId, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		HPIImpl hdao = new HPIImpl();
		boolean result = hdao.delHPI(hpiId);
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
	 * 分页查询现病史
	 * 
	 * @param strwhere
	 * @param page
	 * @param limit
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "gethpi")
	public void getHPI(String strwhere, int page, int limit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		HPIImpl hdao = new HPIImpl();
		Expression exp = new Expression();
		if (strwhere != null && !strwhere.equals("")) {
			exp.orLike("patName", strwhere, String.class);
		}
		String opration = exp.toString();
		List<VMainSuit> list = hdao.getMSByPage(opration, page, limit);
		int count = hdao.getMSCount(opration);
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
