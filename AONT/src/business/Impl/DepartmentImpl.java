package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TDepartment;
import business.DAO.DepartmentDAO;

public class DepartmentImpl implements DepartmentDAO {
	private iHibBaseDAO bdao;

	public DepartmentImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TDepartment TDepartment) {
		Integer id = (Integer) bdao.insert(TDepartment);
		if (id != null && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int TDepartmentid) {
		return bdao.delete(bdao.findById(TDepartment.class, TDepartmentid));
	}

	@Override
	public boolean update(TDepartment TDepartment) {
		return bdao.update(TDepartment);
	}

	@Override
	public TDepartment select(int TDepartmentid) {
		return (TDepartment) bdao.findById(TDepartment.class, TDepartmentid);
	}

	@Override
	public List<TDepartment> select() {
		return bdao.select("from TDepartment");
	}

	@Override
	public int getTDepartmentAmount(String wherecondition) {
		String hql = "from TDepartment ";
		if (wherecondition != null && wherecondition.equals("")) {
			hql += wherecondition;
		}

		return bdao.selectValue(hql);
	}

	@Override
	public List<TDepartment> getTDepartmentByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from TDepartment";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	// public static void main(String[] args) {
	// DepartmentImpl dedao=new DepartmentImpl();
	//
	// // TDepartment edDepartment=new TDepartment();
	// // edDepartment.setDepName("眼科");
	// // System.out.println(dedao.Insert(edDepartment));
	//
	// TDepartment edDepartment=new TDepartment();
	// edDepartment.setDepId(5);
	// edDepartment.setDepName("神经科");
	// System.out.println(dedao.update(edDepartment));
	//
	// }

}
