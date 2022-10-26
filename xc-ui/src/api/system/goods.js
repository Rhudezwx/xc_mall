import request from '@/utils/request'

// 查询宠物商品列表
export function listGoods(query) {
  return request({
    url: '/system/goods/list',
    method: 'get',
    params: query
  })
}

// 查询宠物商品详细
export function getGoods(goodsId) {
  return request({
    url: '/system/goods/' + goodsId,
    method: 'get'
  })
}

// 新增宠物商品
export function addGoods(data) {
  return request({
    url: '/system/goods',
    method: 'post',
    data: data
  })
}

// 修改宠物商品
export function updateGoods(data) {
  return request({
    url: '/system/goods',
    method: 'put',
    data: data
  })
}

// 删除宠物商品
export function delGoods(goodsId) {
  return request({
    url: '/system/goods/' + goodsId,
    method: 'delete'
  })
}
