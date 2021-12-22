export const crudOptions = (vm)=>{ // vm即this
  return {
    columns: [
      {
        title: '客户id',
        key: 'clientId',
      },
      {
        title: '客户名称',
        key: 'clientName',
      },
      {
        title: '客户联系方式',
        key: 'clientTelephone',
      },
      {
        title: '客户邮箱',
        key: 'clientWebsite',
      },
      {
        title: '客户详细地址',
        key: 'clientDetailAddress',
      },
      {
        title: '创建时间',
        key: 'createTime',
        sortable: true,
        type: 'date', //字段类型为时间选择器datepicker,根据类型可自动生成默认配置
        search: {//查询配置，默认启用查询
          disabled: true //【可选】true禁止查询,默认为false
        },
        form: {//form表单的配置
          disabled: true, //禁止添加输入与修改输入【可选】默认false
        }
      },
      // {
      //   title: '状态',
      //   key: 'status',
      //   search: {},//启用查询
      //   type: 'select', //字段类型为选择框
      //   form: { //配置添加和编辑，根据form的配置自动生成addTemplate和editTemplate
      //     rules: [//【可选】添加和修改时的校验规则，不配置则不校验
      //       { required: true, message: '请选择状态' }
      //     ]
      //   },
      //   dict: { //数据字典配置
      //     url: '/api/dicts/StatusEnum' //远程获取数据字典
      //   }
      // },
      // {
      //   title: '地区',
      //   key: 'province',
      //   search: {},//启用查询
      //   type: 'select', //字段类型为选择框
      //   form: {
      //     rules: [{ required: true, message: '请选择地区' }],
      //     component: { //添加和修改时form表单的组件，支持任何v-model组件
      //       props: { //配置自定义组件的属性
      //         filterable: true, //可过滤选择项
      //         multiple: true, //支持多选
      //         clearable: true //可清除
      //       }
      //     }
      //   },
      // }
    ]
  }
}
