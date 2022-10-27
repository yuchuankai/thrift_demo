include "user.thrift"
include "exception.thrift"
include "fileData.thrift"
/**
 * 用户服务
 */
service Service {

  /**保存用户*/
  bool save(1:user.User user),

  /**根据name获取用户列表*/
  list<user.User> findUsersByName(1:string name),

  /**删除用户*/
  void deleteByUserId(1:i32 userId) throws (1: exception.UserNotFoundException e),

  /**传输文件*/
  bool uploadFile(1:fileData.FileData filedata)
}