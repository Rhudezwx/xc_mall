import request from '@/utils/request'

// 查询小铺用户列表
export function listUser(query) {
  return request({
    url: '/system/xcuser/list',
    method: 'get',
    params: query
  })
}

// 查询小铺用户详细
export function getUser(userId) {
  return request({
    url: '/system/xcuser/' + userId,
    method: 'get'
  })
}

// 新增小铺用户
export function addUser(data) {
  return request({
    url: '/system/xcuser',
    method: 'post',
    data: data
  })
}

// 修改小铺用户
export function updateUser(data) {
  return request({
    url: '/system/xcuser',
    method: 'put',
    data: data
  })
}

// 删除小铺用户
export function delUser(userId) {
  return request({
    url: '/system/xcuser/' + userId,
    method: 'delete'
  })
}
