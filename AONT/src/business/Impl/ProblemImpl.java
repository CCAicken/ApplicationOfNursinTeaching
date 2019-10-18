package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TProblem;
import business.DAO.ProblemDAO;

public class ProblemImpl implements ProblemDAO {
	private iHibBaseDAO bdao;

	// public void setBdao(iHibBaseDAOImpl bdao) {
	// this.bdao = bdao;
	// }
	public ProblemImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public int addPro(TProblem pro) {
		// TODO Auto-generated method stub
		int count = (int) bdao.insert(pro);
		return count;
	}

	@Override
	public List<TProblem> getAllPro() {
		// TODO Auto-generated method stub
		String hql = "from TProblem";
		List<TProblem> list = bdao.select(hql);
		return list;
	}

	@Override
	public TProblem getProById(int proId) {
		// TODO Auto-generated method stub
		String hql = "from TProblem where proId=?";
		Object[] para = { proId };
		TProblem problem = (TProblem) bdao.select(hql, para);
		return problem;
	}

	@Override
	public List<TProblem> getProByStuId(String stuId) {
		// TODO Auto-generated method stub
		String hql = "from TProblem where userId=?";
		Object[] para = { stuId };
		List<TProblem> list = bdao.select(hql, para);
		return list;
	}

	@Override
	public List<TProblem> getProByTime(String time) {
		// TODO Auto-generated method stub
		String hql = "from TProblem where createTime like '%?%'";
		Object[] para = { time };
		List<TProblem> list = bdao.select(hql, para);
		return list;
	}

}
