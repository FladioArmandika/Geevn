<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="row page-titles">
    <div class="col-md-5 align-self-center">
        <h3 class="text-themecolor">Employees</h3>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}">Home</a></li>
            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/employee">Employee</a></li>
            <li class="breadcrumb-item active">ADD</li>
        </ol>
    </div>
    <div class="col-md-7 align-self-center">
        <%--<a href="https://wrappixel.com/templates/adminwrap/" class="btn waves-effect waves-light btn btn-info pull-right hidden-sm-down"> Upgrade to Pro</a>--%>
    </div>
</div>

<!-- ============================================================== -->
<!-- Start Page Content -->
<!-- ============================================================== -->
<div class="row">
    <div class="col-lg-8 col-xlg-9 col-md-7">
        <div class="card">
            <!-- Tab panes -->
            <div class="card-body">
                <form:form action="${pageContext.request.contextPath}/employee/add" method="post"  cssClass="form-horizontal form-material">
                    <div class="form-group">
                        <label class="col-md-12">Full Name</label>
                        <div class="col-md-12">
                            <input name="employeeName" type="text" placeholder="Enter full name" class="form-control form-control-line">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="example-email" class="col-md-12">Email</label>
                        <div class="col-md-12">
                            <input type="email" placeholder="Enter employee's email" class="form-control form-control-line" name="name" id="example-email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-12">Sex</label>
                        <div class="col-sm-12">
                            <select name="gender" class="form-control form-control-line">
                                <option>Male</option>
                                <option>Female</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Date Of Birth</label>
                        <div class="col-md-12">
                            <input name="dateOfBirth" type="date" placeholder="Enter Date Of Birth" class="form-control form-control-line">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Phone</label>
                        <div class="col-md-12">
                            <input name="phone" type="text" placeholder="Enter Phone Number" class="form-control form-control-line">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-12">Address</label>
                        <div class="col-md-12">
                            <textarea name="address" rows="5" class="form-control form-control-line"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-12">
                            <button class="btn btn-success">Submit</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
