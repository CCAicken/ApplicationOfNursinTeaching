package controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.LayuiData;
import Model.THPI;
import business.Impl.HPIImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping(value = "HPI")
public class HPIController {
	public void addHPI(String onsetCondition, String pathogeny,
			String mainSymptoms, String accompaniedSymptoms,
			String developmentOfIllness, String treatmentAndNursing, int patId,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		HPIImpl hdao = new HPIImpl();
		THPI hpi = new THPI();
		hpi.setAccompaniedSymptoms(accompaniedSymptoms);
		hpi.setDevelopmentOfIllness(developmentOfIllness);
		hpi.setMainSymptoms(mainSymptoms);
		hpi.setOnsetCondition(onsetCondition);
		hpi.setPathogeny(pathogeny);
		hpi.setPatId(patId);
		hpi.setTreatmentAndNursing(treatmentAndNursing);
		int count = hdao.addHPI(hpi);
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

}
