package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TExam;
import Model.TGrade;
import business.DAO.GradeDAO;

public class GradeImpl implements GradeDAO {
	private iHibBaseDAO bdao;

	public GradeImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}
	@Override
	public boolean insert(TGrade Grade) {
		Integer id= (Integer) bdao.insert(Grade);
		if (id!=null  && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public TGrade select(int gradeid) {
		return (TGrade) bdao.findById(TGrade.class, gradeid);
	}

	@Override
	public List<TGrade> select() {
		return 	bdao.select("from TGrade");
	}

	@Override
	public int geTGradeAmount(String wherecondition) {
		String hql="from TGrade ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<TGrade> geTGradeByLike(String likecondtion, int currentPage,
			int pageSize) {
		String hql = "from TGrade";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		} 
		return	  bdao.selectByPage(hql, currentPage, pageSize);
	}

}
