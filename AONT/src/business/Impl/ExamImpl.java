package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TExam;
import Model.VExam;
import business.DAO.ExamDAO;

public class ExamImpl implements ExamDAO {
	private iHibBaseDAO bdao;

	public ExamImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TExam TExam) {
		Integer id = (Integer) bdao.insert(TExam);
		if (id != null && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int TExamid) {
		return bdao.delete(bdao.findById(TExam.class, TExamid));
	}

	@Override
	public TExam select(int TExamid) {
		return (TExam) bdao.findById(TExam.class, TExamid);
	}

	@Override
	public boolean update(TExam TExam) {
		return bdao.update(TExam);
	}

	@Override
	public List<VExam> select() {
		return bdao.select("from VExam");
	}

	@Override
	public int getVExamAmount(String wherecondition) {
		String hql = "select count(examId) from VExam ";
		if (wherecondition != null && wherecondition.equals("")) {
			hql += wherecondition;
		}

		return bdao.selectValue(hql);
	}

	@Override
	public List<VExam> getVExamByLike(String likecondtion, int currentPage,
			int pageSize) {
		String hql = "from VExam";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

}
