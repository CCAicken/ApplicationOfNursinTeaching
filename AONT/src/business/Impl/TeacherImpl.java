package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TTeacher;
import Model.VTeacher;
import business.DAO.TeacherDAO;

public class TeacherImpl implements TeacherDAO {
	private iHibBaseDAO bdao = null;

	// public void setBdao(iHibBaseDAOImpl bdao) {
	// this.bdao = bdao;
	// }

	public TeacherImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public int addTeacher(TTeacher teahcer) {
		// TODO Auto-generated method stub
		int count = (int) bdao.insert(teahcer);
		return count;
	}

	@Override
	public boolean editTeacher(TTeacher teacher) {
		// TODO Auto-generated method stub
		boolean result = bdao.update(teacher);
		return result;
	}

	@Override
	public boolean delTeacher(String teaId) {
		// TODO Auto-generated method stub
		TTeacher teacher = (TTeacher) bdao.findById(TTeacher.class, teaId);
		boolean result = bdao.delete(teacher);
		return result;
	}

	@Override
	public List<VTeacher> getAllTea() {
		// TODO Auto-generated method stub
		String hql = "from VTeacher";
		List<VTeacher> list = bdao.select(hql);
		return list;
	}

	@Override
	public List<VTeacher> getTeaByUserType(int userTypeId) {
		// TODO Auto-generated method stub
		String hql = "from VTeacher where userType=?";
		Object[] para = { userTypeId };
		List<VTeacher> list = bdao.select(hql, para);
		return list;
	}

	@Override
	public VTeacher getTeaById(String teaId) {
		// TODO Auto-generated method stub
		VTeacher teacher = (VTeacher) bdao.findById(VTeacher.class, teaId);
		return teacher;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TTeacher tea = new TTeacher();
		tea.setTeaId("1008");
		tea.setAgend("男");
		tea.setJobTitle("教授");
		tea.setTeaPhoto("15108809880");
		tea.setTeaName("潘森");
		tea.setTeapwd("123456");
		tea.setUserType(1);
		TeacherDAO teadao = new TeacherImpl();
		// int count = teadao.addTeacher(tea);
		List<VTeacher> list = teadao.getAllTea();
		for (VTeacher tea2 : list) {
			System.out.println(tea2.getTeaId());
		}
	}

	@Override
	public TTeacher teaLogin(String teaId, String pwd) {
		// TODO Auto-generated method stub
		TTeacher teacher = (TTeacher) bdao.findById(TTeacher.class, teaId);
		if (pwd.equals(teacher.getTeapwd())) {
			return teacher;
		} else {
			return null;
		}
	}

	@Override
	public TTeacher getTeaFromTTea(String teaId) {
		// TODO Auto-generated method stub
		TTeacher tea = (TTeacher) bdao.findById(TTeacher.class, teaId);
		return tea;
	}

	@Override
	public List<VTeacher> selByPage(String strwhere, int startPage, int limit) {
		// TODO Auto-generated method stub
		String hql = "from VTeacher" + strwhere;
		List<VTeacher> list = bdao.selectByPage(hql, startPage, limit);
		return list;
	}

	@Override
	public int getTeaCount(String wherecondition) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from VTeacher";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

}
