
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg

import "luban_examples/go_bin/bright/serialization"

type TestTbDemoPrimitive struct {
    _dataMap map[int32]*TestDemoPrimitiveTypesTable
    _dataList []*TestDemoPrimitiveTypesTable
}

func NewTestTbDemoPrimitive(_buf *serialization.ByteBuf) (*TestTbDemoPrimitive, error) {
	if size, err := _buf.ReadSize() ; err != nil {
		return nil, err
	} else {
		_dataList := make([]*TestDemoPrimitiveTypesTable, 0, size)
		dataMap := make(map[int32]*TestDemoPrimitiveTypesTable)

		for i := 0 ; i < size ; i++ {
			if _v, err2 := DeserializeTestDemoPrimitiveTypesTable(_buf); err2 != nil {
				return nil, err2
			} else {
				_dataList = append(_dataList, _v)
				dataMap[_v.X4] = _v
			}
		}
		return &TestTbDemoPrimitive{_dataList:_dataList, _dataMap:dataMap}, nil
	}
}

func (table *TestTbDemoPrimitive) GetDataMap() map[int32]*TestDemoPrimitiveTypesTable {
    return table._dataMap
}

func (table *TestTbDemoPrimitive) GetDataList() []*TestDemoPrimitiveTypesTable {
    return table._dataList
}

func (table *TestTbDemoPrimitive) Get(key int32) *TestDemoPrimitiveTypesTable {
    return table._dataMap[key]
}

