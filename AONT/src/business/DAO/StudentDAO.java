package business.DAO;

import java.util.List;

import Model.TStudent;
import Model.VStudent;

/***
 * 
 * @author Aicken 学生模块接口设计
 */
public interface StudentDAO {
	/**
	 * 添加学生
	 * 
	 * @param stu
	 * @return
	 */
	public int addStu(TStudent stu);

	/**
	 * 编辑学生
	 * 
	 * @param stu
	 * @return
	 */
	public boolean editStu(TStudent stu);

	/**
	 * 根据学生Id删除学生
	 * 
	 * @param stuId
	 * @return
	 */
	public boolean delStu(String stuId);

	/**
	 * 获取所有的学生
	 * 
	 * @return
	 */
	public List<VStudent> getAllStu();

	/**
	 * 根据班级Id获取学生
	 * 
	 * @param classId
	 * @return
	 */
	public List<VStudent> getStuByClassId(int classId);

	/**
	 * 根据学生Id获取学生信息
	 * 
	 * @param stuId
	 * @return
	 */
	public VStudent getStuByStuId(String stuId);
}
