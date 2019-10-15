package business.DAO;

import java.util.List;

import Model.TTeacher;

/***
 * 
 * @author Aicken 教师模块接口设计
 */
public interface TeacherDAO {
	/**
	 * 获取所有教师或管理员
	 * 
	 * @return
	 */
	public List<TTeacher> getAllTeachers();

	/**
	 * 根据用户类型获取对应教师或管理员
	 * 
	 * @param userTypeId
	 * @return
	 */
	public List<TTeacher> getTeaByUserType(int userTypeId);

	/**
	 * 根据用户Id获取用户
	 * 
	 * @param userId
	 * @return
	 */
	public TTeacher getTeaByTeaId(String userId);

	/**
	 * 添加教师用户
	 * 
	 * @param teacher
	 * @return
	 */
	public int addTeacher(TTeacher teacher);

	/**
	 * 编辑教师信息
	 * 
	 * @param teacher
	 * @return
	 */
	public boolean editTeacher(TTeacher teacher);

	/**
	 * 删除教师用户
	 * 
	 * @param teacher
	 * @return
	 */
	public boolean delTeacher(TTeacher teacher);
}
