<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row page-titles">
    <div class="col-md-5 align-self-center">
        <h3 class="text-themecolor">Profile</h3>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript:void(0)">Home</a></li>
            <li class="breadcrumb-item active">Employee's Profile</li>
        </ol>
    </div>
    <div class="col-md-7 align-self-center">
        <%--<a href="https://wrappixel.com/templates/adminwrap/" class="btn waves-effect waves-light btn btn-info pull-right hidden-sm-down"> Upgrade to Pro</a>--%>
    </div>
</div>

<!-- Row -->
<div class="row">
    <!-- Column -->
    <div class="col-lg-4 col-xlg-3 col-md-5">
        <div class="card">
            <div class="card-body">
                <center class="m-t-30"> <img src="<c:url value='/resources/img/pp3.jpg'/>" class="img-circle" width="150" />
                    <h4 class="card-title m-t-10">Hanna Gover</h4>
                    <h6 class="card-subtitle">Accoubts Manager Amix corp</h6>
                    <div class="row text-center justify-content-md-center">
                        <div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-people"></i> <font class="font-medium">254</font></a></div>
                        <div class="col-4"><a href="javascript:void(0)" class="link"><i class="icon-picture"></i> <font class="font-medium">54</font></a></div>
                    </div>
                </center>
            </div>
        </div>
    </div>
    <!-- Column -->
    <!-- Column -->
    <div class="col-lg-8 col-xlg-9 col-md-7">
        <div class="card">
            <!-- Tab panes -->
            <div class="card-body">
                <form class="form-horizontal form-material">
                    <div class="form-group">
                        <label class="col-md-12">Full Name</label>
                        <div class="col-md-12">
                            <input type="text" value="${employee.employeeName}" class="form-control form-control-line">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="example-email" class="col-md-12">Email</label>
                        <div class="col-md-12">
                            <input type="email" value="${employee.email}" placeholder="email" class="form-control form-control-line" name="example-email" id="example-email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Password</label>
                        <div class="col-md-12">
                            <input type="password" value="password" class="form-control form-control-line">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Message</label>
                        <div class="col-md-12">
                            <textarea rows="5" class="form-control form-control-line"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-12">Select Country</label>
                        <div class="col-sm-12">
                            <select class="form-control form-control-line">
                                <option>London</option>
                                <option>India</option>
                                <option>Usa</option>
                                <option>Canada</option>
                                <option>Thailand</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-12">
                            <button class="btn btn-success">Update Profile</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Column -->
</div>

