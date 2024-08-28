$(document).ready(function () {
    //event delegation delete majors
    $('#majors-container').on('click', '.btn-delete', function () {
        $(this).closest('.major-card').remove();
        //looping index after delete
        $('#majors-container .major-card').each(function (index) {
            $(this).find('[name]').each(function () {
                let nameAttr = $(this).attr('name');
                nameAttr = nameAttr.replace(/jurusanModels\[\d+\]/, `jurusanModels[${index}]`);
                $(this).attr('name', nameAttr);
            });
        });
    });

    //event delegation delete year
    $('.years-container').on('click', '.btn-delete-year', function () {
        $(this).closest('.year-card').remove();
        //looping index after delete
        $('.years-container .year-card').each(function (index) {
            $(this).find('[name]').each(function () {
                let nameAttr = $(this).attr('name');
                nameAttr = nameAttr.replace(/studentCountModels\[\d+\]/, `studentCountModels[${index}]`);
                $(this).attr('name', nameAttr);
            });
        });
    });

    //event delegation delete students
    $('.mahasiswa-container').on('click', '.btn-delete-students', function () {
        $(this).closest('.card-students').remove();
        //looping index after delete
        $('.mahasiswa-container .card-students').each(function (index) {
            $(this).find('[name]').each(function () {
                let nameAttr = $(this).attr('name');
                nameAttr = nameAttr.replace(/mahasiswa\[\d+\]/, `mahasiswa[${index}]`);
                $(this).attr('name', nameAttr);
            });
        });
    });

    //event delegation delete course row
    $('.course-body').on('click', '.btn-delete-course', function () {
        $(this).closest('.course-row').remove();

        $('.course-body .course-row').each(function (index) {
            $(this).find('th[scope="row"]').text(index + 1);

            $(this).find('[name]').each(function () {
                let nameAttr = $(this).attr('name');

                nameAttr = nameAttr.replace(/mataKuliah\[\d+\]/, `mataKuliah[${index}]`);

                $(this).attr('name', nameAttr);
            })
        });
    });
    //event delegation delete table
    $('.course-container').on('click', '.btn-delete-course-tbl', function () {
        $(this).closest('.course-container').remove();
    });

    // Event delegation untuk tombol tambah "Majors"
    $('#majors-container').on('click', '.btn-add', function () {
        var majorIndex = $('#majors-container .major-card').length; //Fungsi: Menghitung jumlah elemen dengan kelas major-card di dalam majors-container.

        let newCard =
            '<div class="card major-card mb-3">\n' +
            '    <h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '        Majors\n' +
            '        <div class="ms-auto">\n' +
            '            <button class="btn btn-outline-success btn-add" type="button">\n' +
            '                New Majors\n' +
            '            </button>\n' +
            '            <button class="btn btn-outline-danger btn-delete" type="button">\n' +
            '                Delete Majors\n' +
            '            </button>\n' +
            '        </div>\n' +
            '    </h5>\n' +
            '    <div class="card-body">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + majorIndex + '_code" class="form-label">Majors Code</label>\n' +
            '            <input type="text" id="id_' + majorIndex + '_code" class="form-control" name="jurusanModels[' + majorIndex + '].code">\n' +
            '        </div>\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + majorIndex + '_name" class="form-label">Majors Name</label>\n' +
            '            <input type="text" id="id_' + majorIndex + '_name" class="form-control" name="jurusanModels[' + majorIndex + '].name">\n' +
            '        </div>\n' +
            '    </div>\n' +
            '    <div class="container-fluid years-container">\n' +
            '        <div class="card year-card mb-3">\n' +
            '<h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '    Year\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-add-year" type="button">\n' +
            '            New Year Majors\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-year" type="button">\n' +
            '            Delete Year Majors\n' +
            '        </button>\n' +
            '    </div>\n' +
            '</h5>\n' +
            '            <div class="card-body">\n' +
            '                <div class="mb-3">\n' +
            '                    <label for="id_' + majorIndex + '_years_0" class="form-label">Year</label>\n' +
            '                    <input type="text" id="id_' + majorIndex + '_years_0" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[0].years">\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="container-fluid mahasiswa-container">\n' +
            '                <div class="card card-students mb-3">\n' +
            '<h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '    Students\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-students" type="button">\n' +
            '            New Students\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-students" type="button">\n' +
            '            Delete Students\n' +
            '        </button>\n' +
            '    </div>\n' +
            '</h5>\n' +
            '                    <div class="card-body">\n' +
            '                        <div class="mb-3">\n' +
            '                            <label for="id_' + majorIndex + '_years_0_nim_0" class="form-label">NIM</label>\n' +
            '                            <input type="text" id="id_' + majorIndex + '_years_0_nim_0" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[0].mahasiswa[0].nim">\n' +
            '                        </div>\n' +
            '                        <div class="mb-3">\n' +
            '                            <label for="id_' + majorIndex + '_years_0_name_0" class="form-label">Mahasiswa Name</label>\n' +
            '                            <input type="text" id="id_' + majorIndex + '_years_0_name_0" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[0].mahasiswa[0].name">\n' +
            '                        </div>\n' +
            '                    <div class="course-container">\n' +
            '<h5 class="d-flex justify-content-between align-items-center">\n' +
            '    Course\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-add-course" type="button">\n' +
            '            New Course\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '            Delete Course\n' +
            '        </button>\n' +
            '<button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '    Delete Course Table\n' +
            '</button>\n' +
            '    </div>\n' +
            '</h5>' +
            '                        <table class="table table-striped table-hover table-bordered">\n' +
            '                            <thead>\n' +
            '                                <tr>\n' +
            '                                    <th>No</th>\n' +
            '                                    <th>Code</th>\n' +
            '                                    <th>Name</th>\n' +
            '                                    <th>Dosen</th>\n' +
            '                                    <th>Nilai</th>\n' +
            '                                    <th>Action</th>\n' +
            '                                </tr>\n' +
            '                            </thead>\n' +
            '                            <tbody class="course-body">\n' +
            '                                <tr class="course-row">\n' +
            '                                    <th scope="row">1</th>\n' +
            '                                    <td>\n' +
            '                                        <input type="text" class="form-control" name="jurusanModels['+ majorIndex +'].studentCountModels[0].mahasiswa[0].mataKuliah[0].code">\n' +
            '                                    </td>\n' +
            '                                    <td>\n' +
            '                                        <input type="text" class="form-control" name="jurusanModels['+ majorIndex +'].studentCountModels[0].mahasiswa[0].mataKuliah[0].name">\n' +
            '                                    </td>\n' +
            '                                    <td>\n' +
            '                                        <input type="text" class="form-control" name="jurusanModels['+ majorIndex +'].studentCountModels[0].mahasiswa[0].mataKuliah[0].dosenName">\n' +
            '                                    </td>\n' +
            '                                    <td>\n' +
            '                                        <input type="text" class="form-control" name="jurusanModels['+ majorIndex +'].studentCountModels[0].mahasiswa[0].mataKuliah[0].nilai">\n' +
            '                                    </td>\n' +
            '<td>\n' +
            '    <a class="btn btn-outline-danger btn-delete-course">\n' +
            '        <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '    </a>\n' +
            '</td>\n' +
            '                                </tr>\n' +
            '                            </tbody>\n' +
            '                        </table>\n' +
            '                    </div>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>';

        $('#majors-container').append(newCard);
    });

    // Event delegation untuk tombol tambah "Years" dalam setiap "Majors"
    $('#majors-container').on('click', '.btn-add-year', function () {
        var majorCard = $(this).closest('.major-card'); ////Fungsi: Mencari elemen terdekat dengan kelas major-card dari elemen yang memicu event ($(this)).
        var yearsContainer = majorCard.find('.years-container'); //Fungsi: Mencari elemen dengan kelas years-container di dalam majorCard.
        var majorIndex = $('#majors-container .major-card').index(majorCard); //Fungsi: Menentukan indeks posisi majorCard di dalam elemen #majors-container.
        var yearIndex = yearsContainer.find('.year-card').length; //Fungsi: Menghitung jumlah elemen dengan kelas year-card di dalam yearsContainer.

        let newYearCard = '<div class="card year-card mb-3">\n' +
            '<h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '    Year\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-add-year" type="button">\n' +
            '            New Year Majors\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-year" type="button">\n' +
            '            Delete Year Majors\n' +
            '        </button>\n' +
            '    </div>\n' +
            '</h5>\n' +
            '    <div class="card-body">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + majorIndex + '_years_' + yearIndex + '" class="form-label">Year</label>\n' +
            '            <input type="text" id="id_' + majorIndex + '_years_' + yearIndex + '" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].years">\n' +
            '        </div>\n' +
            '    </div>\n' +
            '    <div class="container-fluid mahasiswa-container">\n' +
            '        <div class="card card-students mb-3">\n' +
            '<h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '    Students\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-students" type="button">\n' +
            '            New Students\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-students" type="button">\n' +
            '            Delete Students\n' +
            '        </button>\n' +
            '    </div>\n' +
            '</h5>\n' +
            '            <div class="card-body">\n' +
            '                <div class="mb-3">\n' +
            '                    <label for="id_' + majorIndex + '_years_' + yearIndex + '_nim_0" class="form-label">NIM</label>\n' +
            '                    <input type="text" id="id_' + majorIndex + '_years_' + yearIndex + '_nim_0" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].nim">\n' +
            '                </div>\n' +
            '                <div class="mb-3">\n' +
            '                    <label for="id_' + majorIndex + '_years_' + yearIndex + '_name_0" class="form-label">Mahasiswa Name</label>\n' +
            '                    <input type="text" id="id_' + majorIndex + '_years_' + yearIndex + '_name_0" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].name">\n' +
            '                </div>\n' +
            '        <div class="course-container">\n' +
            '<h5 class="d-flex justify-content-between align-items-center">\n' +
            '    Course\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-add-course" type="button">\n' +
            '            New Course\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '            Delete Course\n' +
            '        </button>\n' +
            '<button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '    Delete Course Table\n' +
            '</button>\n' +
            '    </div>\n' +
            '</h5>' +
            '            <table class="table table-striped table-hover table-bordered">\n' +
            '                <thead>\n' +
            '                    <tr>\n' +
            '                        <th>No</th>\n' +
            '                        <th>Code</th>\n' +
            '                        <th>Name</th>\n' +
            '                        <th>Dosen</th>\n' +
            '                        <th>Nilai</th>\n' +
            '                        <th>Action</th>\n' +
            '                    </tr>\n' +
            '                </thead>\n' +
            '                <tbody class="course-body">\n' +
            '                    <tr class="course-row">\n' +
            '                        <th scope="row">1</th>\n' +
            '                        <td>\n' +
            '                            <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].mataKuliah[0].code">\n' +
            '                        </td>\n' +
            '                        <td>\n' +
            '                            <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].mataKuliah[0].name">\n' +
            '                        </td>\n' +
            '                        <td>\n' +
            '                            <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].mataKuliah[0].dosenName">\n' +
            '                        </td>\n' +
            '                        <td>\n' +
            '                            <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[0].mataKuliah[0].nilai">\n' +
            '                        </td>\n' +
            '<td>\n' +
            '    <a class="btn btn-outline-danger btn-delete-course">\n' +
            '        <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '    </a>\n' +
            '</td>\n' +
            '                    </tr>\n' +
            '                </tbody>\n' +
            '            </table>\n' +
            '        </div>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>';

        yearsContainer.append(newYearCard);
    });

    // Event delegation untuk tombol tambah "Students"
    $('#majors-container').on('click', '.btn-students', function () {
        var majorCard = $(this).closest('.major-card'); //Fungsi: Mencari elemen terdekat dengan kelas major-card dari elemen yang memicu event ($(this)).
        var yearsContainer = majorCard.find('.years-container'); //Fungsi: Mencari elemen dengan kelas years-container di dalam majorCard.
        var yearCard = $(this).closest('.year-card'); //Fungsi: Mencari elemen terdekat dengan kelas year-card dari elemen yang memicu event ($(this)).
        var majorIndex = $('#majors-container .major-card').index(majorCard); //Fungsi: Menentukan indeks posisi majorCard di dalam elemen #majors-container.
        var yearIndex = yearsContainer.find('.year-card').index(yearCard); //Fungsi: Menentukan indeks posisi yearCard di dalam yearsContainer.
        var studentsContainer = yearCard.find('.mahasiswa-container'); //Fungsi: Mencari elemen dengan kelas mahasiswa-container di dalam yearCard.
        var studentIndex = studentsContainer.find('.card-students').length; //Fungsi: Menghitung jumlah elemen dengan kelas card-students di dalam studentsContainer.

        let newStudentCard = '<div class="card card-students mb-3">\n' +
            '<h5 class="card-header d-flex justify-content-between align-items-center">\n' +
            '    Students\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-students" type="button">\n' +
            '            New Students\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-students" type="button">\n' +
            '            Delete Students\n' +
            '        </button>\n' +
            '    </div>\n' +
            '</h5>\n' +
            '    <div class="card-body">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + majorIndex + '_years_' + yearIndex + '_nim_' + studentIndex + '" class="form-label">NIM</label>\n' +
            '            <input type="text" id="id_' + majorIndex + '_years_' + yearIndex + '_nim_' + studentIndex + '" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].nim">\n' +
            '        </div>\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + majorIndex + '_years_' + yearIndex + '_name_' + studentIndex + '" class="form-label">Mahasiswa Name</label>\n' +
            '            <input type="text" id="id_' + majorIndex + '_years_' + yearIndex + '_name_' + studentIndex + '" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].name">\n' +
            '        </div>\n' +
            '    <div class="course-container">\n' +
            '<h5 class="d-flex justify-content-between align-items-center">\n' +
            '    Course\n' +
            '    <div class="ms-auto">\n' +
            '        <button class="btn btn-outline-success ms-auto btn-add-course" type="button">\n' +
            '            New Course\n' +
            '        </button>\n' +
            '        <button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '            Delete Course\n' +
            '        </button>\n' +
            '<button class="btn btn-outline-danger ms-auto btn-delete-course-tbl" type="button">\n' +
            '    Delete Course Table\n' +
            '</button>\n' +
            '    </div>\n' +
            '</h5>' +
            '        <table class="table table-striped table-hover table-bordered">\n' +
            '            <thead>\n' +
            '                <tr>\n' +
            '                    <th>No</th>\n' +
            '                    <th>Code</th>\n' +
            '                    <th>Name</th>\n' +
            '                    <th>Dosen</th>\n' +
            '                    <th>Nilai</th>\n' +
            '                    <th>Action</th>\n' +
            '                </tr>\n' +
            '            </thead>\n' +
            '            <tbody class="course-body">\n' +
            '                <tr class="course-row">\n' +
            '                    <th scope="row">1</th>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[0].code">\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[0].name">\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[0].dosenName">\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[0].nilai">\n' +
            '                    </td>\n' +
            '<td>\n' +
            '    <a class="btn btn-outline-danger btn-delete-course">\n' +
            '        <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '    </a>\n' +
            '</td>\n' +
            '                </tr>\n' +
            '            </tbody>\n' +
            '        </table>\n' +
            '    </div>\n' +
            '    </div>\n' +
            '</div>';

        studentsContainer.append(newStudentCard);
    });

    $('#majors-container').on('click', '.btn-add-course', function () {
        var majorCard = $(this).closest('.major-card'); // Cari elemen terdekat dengan kelas major-card
        var yearsContainer = majorCard.find('.years-container'); // Cari elemen dengan kelas years-container di dalam majorCard
        var yearCard = $(this).closest('.year-card'); // Cari elemen terdekat dengan kelas year-card
        var studentsContainer = yearCard.find('.mahasiswa-container'); // Cari elemen dengan kelas mahasiswa-container di dalam yearCard
        var studentCard = $(this).closest('.card-students'); // Cari elemen terdekat dengan kelas card-students
        var courseContainer = studentCard.find('.course-container');
        var majorIndex = $('#majors-container .major-card').index(majorCard); // Menentukan indeks majorCard di dalam #majors-container
        var yearIndex = yearsContainer.find('.year-card').index(yearCard); // Menentukan indeks yearCard di dalam yearsContainer
        var studentIndex = studentsContainer.find('.card-students').index(studentCard); // Menentukan indeks studentCard di dalam studentsContainer
        var courseIndex = courseContainer.find('.course-row').length; // Menghitung jumlah baris course dalam tabel

        let newCourseRow = '<tr class="course-row" >\n' +
            '    <th scope="row">' + (courseIndex + 1) + '</th>\n' +
            '    <td><input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[' + courseIndex + '].code"></td>\n' +
            '    <td><input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[' + courseIndex + '].name"></td>\n' +
            '    <td><input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[' + courseIndex + '].dosenName"></td>\n' +
            '    <td><input type="text" class="form-control" name="jurusanModels[' + majorIndex + '].studentCountModels[' + yearIndex + '].mahasiswa[' + studentIndex + '].mataKuliah[' + courseIndex + '].nilai"></td>\n' +
            '<td>\n' +
            '    <a class="btn btn-outline-danger btn-delete-course">\n' +
            '        <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '    </a>\n' +
            '</td>\n' +
            '</tr>';

        courseContainer.find('.course-body').append(newCourseRow);
    });
});