import request from '@/utils/request'

// 查询小铺订单列表
export function listOrder(query) {
  return request({
    url: '/system/order/list',
    method: 'get',
    params: query
  })
}

// 查询小铺订单详细
export function getOrder(orderId) {
  return request({
    url: '/system/order/' + orderId,
    method: 'get'
  })
}

// 新增小铺订单
export function addOrder(data) {
  return request({
    url: '/system/order',
    method: 'post',
    data: data
  })
}

// 修改小铺订单
export function updateOrder(data) {
  return request({
    url: '/system/order',
    method: 'put',
    data: data
  })
}

// 删除小铺订单
export function delOrder(orderId) {
  return request({
    url: '/system/order/' + orderId,
    method: 'delete'
  })
}
