package business.DAO;

import java.util.List;

import Model.TTeacher;
import Model.VTeacher;

/***
 * 
 * @author Aicken 教师模块接口设计
 */
public interface TeacherDAO {
	/**
	 * 添加教师
	 * 
	 * @param teahcer
	 * @return
	 */
	public int addTeacher(TTeacher teahcer);

	/**
	 * 编辑教师信息
	 * 
	 * @param teacher
	 * @return
	 */
	public boolean editTeacher(TTeacher teacher);

	/**
	 * 删除教师
	 * 
	 * @param teacher
	 * @return
	 */
	public boolean delTeacher(String teaId);

	/**
	 * 获取所有教师
	 * 
	 * @return
	 */
	public List<VTeacher> getAllTea();

	/**
	 * 根据用户类型Id获取教师
	 * 
	 * @return
	 */
	public List<VTeacher> getTeaByUserType();

	/**
	 * 根据用户Id获取教师信息
	 * 
	 * @param teaId
	 * @return
	 */
	public VTeacher getTeaById(String teaId);
}
