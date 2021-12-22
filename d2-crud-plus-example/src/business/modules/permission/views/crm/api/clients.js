//import request from '@/business/api/request.mock' 示例当中用的是模拟数据
import { request } from '@/api/service' //改成这个请求真实后端
export function GetList (obj) {
  return request({
    url: '/api/crm/clients/page',
    method: 'post',
    data: obj
  })
}
export function AddObj (obj) {
  return request({
    url: '/api/crm/clients/save',
    method: 'post',
    data: obj
  })
}
export function UpdateObj (obj) {
  return request({
    url: '/api/crm/clients/update',
    method: 'post',
    data: obj
  })
}
export function DelObj (obj) {
  return request({
    url: '/api/crm/clients/delete',
    method: 'post',
    data: obj
  })
}
