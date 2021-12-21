//import request from '@/business/api/request.mock' 示例当中用的是模拟数据
import { request } from '@/api/service' //改成这个请求真实后端
export function GetList (query) {
  return request({
    url: '/api/user/list',
    method: 'post'
  })
}
export function AddObj (obj) {
  return request({
    url: '/api/user/save',
    method: 'post',
    data: obj
  })
}
export function UpdateObj (obj) {
  return request({
    url: '/api/user/update',
    method: 'post',
    data: obj
  })
}
export function DelObj (id) {
  return request({
    url: '/api/user/delete',
    method: 'post',
    params: { id }
  })
}
