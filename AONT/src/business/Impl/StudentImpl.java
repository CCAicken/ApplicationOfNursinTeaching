package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TStudent;
import Model.VStudent;
import business.DAO.StudentDAO;

public class StudentImpl implements StudentDAO {
	private iHibBaseDAO bdao = null;

	// public void setBdao(iHibBaseDAOImpl bdao) {
	// this.bdao = bdao;
	// }

	public StudentImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean addStu(TStudent stu) {
		// TODO Auto-generated method stub
		String id = (String) bdao.insert(stu);
		if (id != null && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean editStu(TStudent stu) {
		// TODO Auto-generated method stub
		boolean result = bdao.update(stu);
		return result;
	}

	@Override
	public boolean delStu(String stuId) {
		// TODO Auto-generated method stub
		TStudent student = (TStudent) bdao.findById(TStudent.class, stuId);
		boolean result = bdao.delete(student);
		return result;
	}

	@Override
	public List<VStudent> getAllStu() {
		// TODO Auto-generated method stub
		String hql = "from VStudent";
		List<VStudent> list = bdao.select(hql);
		return list;
	}

	@Override
	public List<VStudent> getStuByClassId(int classId) {
		// TODO Auto-generated method stub
		String hql = "from VStudent where classId=?";
		Object[] para = { classId };
		List<VStudent> list = bdao.select(hql, para);
		return list;
	}

	@Override
	public VStudent getStuByStuId(String stuId) {
		// TODO Auto-generated method stub
		VStudent student = (VStudent) bdao.findById(VStudent.class, stuId);
		return student;
	}

	@Override
	public TStudent stuLogin(String stuId, String pwd) {
		// TODO Auto-generated method stub
		TStudent student = (TStudent) bdao.findById(TStudent.class, stuId);
		if (student == null) {
			return null;
		} else {
			if (pwd.equals(student.getStupwd())) {
				return student;
			} else {
				return null;
			}
		}

	}

	@Override
	public TStudent getStuFromTStu(String stuId) {
		// TODO Auto-generated method stub
		TStudent stu = (TStudent) bdao.findById(TStudent.class, stuId);
		return stu;
	}

	@Override
	public List<VStudent> selStuByPage(String strwhere, int page, int limit) {
		// TODO Auto-generated method stub
		String hql = "from VStudent" + strwhere;
		List<VStudent> list = bdao.selectByPage(hql, page, limit);
		return list;
	}

	@Override
	public int getStuCount(String strwhere) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from VStudent";
		if (strwhere != null && !strwhere.equals("")) {
			hql += strwhere;
		}
		return bdao.selectValue(hql);
	}

}
