<%@page contentType="text/html;UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <script type="text/javascript">

        $(function () {

            $('#dg').edatagrid({

                url: '${pageContext.request.contextPath}/banner/selectByPage',

                updateUrl: "${pageContext.request.contextPath}/banner/update",
                destroyUrl: "${pageContext.request.contextPath}/banner/delete",

//                method: "get",
                columns: [[
                    {field: 'name', title: '标题', width: 100},
                    {
                        field: 'status', title: '状态', width: 100, editor: {
                        type: "text",
                        options: {
                            required: true
                        }
                    }
                    },
                    {field: 'description', title: '描述', width: 100, align: 'right'},
                    {field: 'createDate', title: '时间', width: 100},
                ]],
                fit: true,
                fitColumns: true,
                pagination: true,
                pageSize: 5,
                pageList: [5, 10, 15,20],

                toolbar: [{
                    iconCls: 'icon-add',
                    text: "添加",

                    handler: function () {
//                        alert('添加按钮')
                        $("#addDiv").dialog("open");

                    }
                }, '-', {
                    iconCls: 'icon-edit',
                    text: "修改",

                    handler: function () {
                        var row = $("#dg").edatagrid("getSelected");
                        if (row == null) {
                            alert("请先选中行")
                        } else {
                            var index = $("#dg").edatagrid("getRowIndex", row);
                            $("#dg").edatagrid("editRow", index);
                        }
                    }
                }, '-', {
                    iconCls: 'icon-remove',
                    text: "删除",

                    handler: function () {
//                        alert('删除按钮')
                        var row = $("#dg").edatagrid("getSelected");
                        if (row == null) {
                            alert("请先选中行")
                        } else {
                            $('#dg').edatagrid('destroyRow');
                        }

                    }
                }, '-', {
                    iconCls: 'icon-save',
                    text: "保存",

                    handler: function () {
                        alert("aaaaaaaaaaaaaaa")
                        $("#dg").edatagrid("saveRow")
                    }
                }],
                view: detailview,
                detailFormatter: function (rowIndex, rowData) {
                    return '<table><tr>' +
                            '<td rowspan=2 style="border:0">' +
                            '<img src="${pageContext.request.contextPath}/' + rowData.url + '" style="height:50px;"></td>' +
                            '<td style="border:0">' +
                            '   <p>Attribute: ' + rowData.description + '</p>' +
                            '   <p>Status: ' + rowData.createDate + '</p>' +
                            '</td>' +
                            '</tr></table>';
                },

            });
            $("#addDiv").dialog({
                closed: true,
                buttons: "#addSubmitBtn",
                width: 300,
                title: "添加数据"
            });

        })

        function doadd() {
            $("#addForm").form("submit", {
                url: "${pageContext.request.contextPath}/banner/insert",
                success: function (data) {
                    if (data == "true") {
                        alert("添加成功");
                    } else {
                        alert("添加失败");
                    }
                    //关闭添加对话框
                    $("#addDiv").dialog("close");

                    //刷新datagrid
                    $("#dg").datagrid("reload");

                }
            });
        }


    </script>

<div id="addDiv">
    <form id="addForm" method="post">
        图片名：<input name="name"/><br/>
        描述：<input name="description"/><br/>
        状态：<input type="radio" name="status" value="0"/> 不展示
        <input type="radio" name="status" value="1"/> 展示<br/>
    </form>
</div>

<div id="addSubmitBtn">
    <a class="easyui-linkbutton" onclick="doadd()">立即添加</a>
</div>

<table id="dg"></table>



