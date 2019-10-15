package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TCheck;
import Model.TClass;
import Model.VCheck;
import Model.VClass;
import business.DAO.ClassDAO;

public class ClassImpl implements ClassDAO {
	private iHibBaseDAO bdao;

	public ClassImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}
	@Override
	public boolean Insert(TClass tclass) {
		Integer id= (Integer) bdao.insert(tclass);
		if (id!=null  && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int tclassid) {
		return bdao.delete(bdao.findById(TClass.class, tclassid));
	}

	@Override
	public boolean update(TClass TClass) {
		return bdao.update(TClass);
	}

	@Override
	public TClass select(int TClassid) {
		return (TClass) bdao.findById(TClass.class, TClassid);
	}

	@Override
	public VClass selectVclass(int VClassid) {
		return (VClass) bdao.findById(VClass.class, VClassid);
	}

	@Override
	public List<VClass> select() {
		return 	bdao.select("from VClass");
	}

	@Override
	public int getAchievementrAmount(String wherecondition) {
		String hql="from VClass ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<VClass> getAchievementByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VClass";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		} 
		return	  bdao.selectByPage(hql, currentPage, pageSize);
	}

}
