<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="row page-titles">
    <div class="col-md-5 align-self-center">
        <h3 class="text-themecolor">Employees</h3>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
            <li class="breadcrumb-item active">EMPLOYEES</li>
        </ol>
    </div>
    <div class="col-md-7 align-self-center">
        <%--<a href="https://wrappixel.com/templates/adminwrap/" class="btn waves-effect waves-light btn btn-info pull-right hidden-sm-down"> Upgrade to Pro</a>--%>
    </div>
</div>

<%--TABLE--%>
<div class="row">
    <!-- column -->
    <div class="col-12">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">EMPLOYEES</h4>
                <a href="employee/add" class="pull-right"><h6 class="card-subtitle">Add Employee</h6></a>
                <div class="table-responsive">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>ID</th>
                                <th>Name</th>
                                <th>SEX</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:set var="no" value="0"/>
                            <c:forEach var="employee" items="${employees}">
                                <tr>
                                    <td>${no=no+1}</td>
                                    <td>${employee.employeeId}</td>
                                    <td>${employee.employeeName}</td>
                                    <td>${employee.gender}</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/employee/${employee.employeeId}" class="btn btn-info">VIEW</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

