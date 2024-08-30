$(document).ready(function () {

    //remove dusun
    $('#dusun-container').on('click', '.btn-delete-dusun', function () {
        $(this).closest('.dusun-card').remove();

        $('#dusun-container .dusun-card').each(function (index) {
            $(this).find('[name]').each(function () {
                let nameAttr = $(this).attr('name');
                nameAttr = nameAttr.replace(/dusunModels\[\d+\]/, `dusunModels[${index}]`);
                $(this).attr('name', nameAttr);
            });
        });
    });
    //remove rw
    $('#dusun-container').on('click', '.btn-delete-rw', function () {
        $(this).closest('.rw-card').remove();
        //update index after delete
        $('#dusun-container .dusun-card').each(function (dusunIndex) {
            $(this).find('.rw-card').each(function (rwIndex) {
                $(this).find('[name]').each(function () {
                    let nameAttr = $(this).attr('name');
                    nameAttr = nameAttr.replace(/dusunModels\[\d+\].rwModels\[\d+\]/, `dusunModels[${dusunIndex}].rwModels[${rwIndex}]`);
                    $(this).attr('name', nameAttr);
                });
            });
        });
    });
    //remove rt
    $('#dusun-container').on('click', '.btn-delete-rt', function () {
        $(this).closest('.rt-card').remove();
        //update index after delete
        $('#dusun-container .dusun-card').each(function (dusunIndex) {
            $(this).find('.rw-card').each(function (rwIndex) {
                $(this).find('.rt-card').each(function (rtIndex) {
                    $(this).find('[name]').each(function () {
                        let nameAttr = $(this).attr('name');
                        nameAttr = nameAttr.replace(/dusunModels\[\d+\].rwModels\[\d+\].rtModels\[\d+\]/, `dusunModels[${dusunIndex}].rwModels[${rwIndex}].rtModels[${rtIndex}]`);
                        $(this).attr('name', nameAttr);
                    });
                });
            });
        });
    });
    //remove warga table
    $('#dusun-container').on('click', '.btn-delete-list-warga', function () {
        $(this).closest('.warga-container').remove();

        $('#dusun-container .dusun-card').each(function (dusunIndex) {
            $(this).find('.rw-card').each(function (rwIndex) {
                $(this).find('.rt-card').each(function (rtIndex) {
                    $(this).find('.warga-body').each(function (wargaIndex) {
                        $(this).find('[name]').each(function () {
                            let nameAttr = $(this).attr('name');
                            nameAttr = nameAttr.replace(/dusunModels\[\d+\].rwModels\[\d+\].rtModels\[\d+\].peopleModel\[\d+\]/, `dusunModels[${dusunIndex}].rwModels[${rwIndex}].rtModels[${rtIndex}].peopleModel[${wargaIndex}]`);
                            $(this).attr('name', nameAttr);
                        });
                    });
                });
            });
        });
    });
    // Menangani klik pada tombol delete dalam container dengan id 'dusun-container'
    $('#dusun-container').on('click', '.btn-delete-warga', function () {
        // Hapus baris yang berisi tombol delete yang diklik
        $(this).closest('.warga-row').remove();

        // Perbarui indeks untuk setiap baris yang tersisa dalam hierarki dusun, rw, rt, dan warga
        $('#dusun-container .dusun-card').each(function (dusunIndex) { // Iterasi setiap dusun-card
            $(this).find('.rw-card').each(function (rwIndex) { // Iterasi setiap rw-card dalam dusun
                $(this).find('.rt-card').each(function (rtIndex) { // Iterasi setiap rt-card dalam rw
                    $(this).find('.warga-body .warga-row').each(function (wargaIndex) { // Iterasi setiap warga-row dalam rt

                        // Perbarui nomor urut di kolom 'th[scope="row"]' sesuai dengan indeks warga yang baru
                        $(this).find('th[scope="row"]').text(wargaIndex + 1);

                        // Perbarui atribut 'name' dari setiap input di dalam warga-row
                        $(this).find('[name]').each(function () {
                            // Ambil nilai atribut 'name' yang ada
                            let nameAttr = $(this).attr('name');

                            // Ganti bagian indeks dalam atribut 'name' agar sesuai dengan posisi baru
                            nameAttr = nameAttr.replace(/dusunModels\[\d+\]\.rwModels\[\d+\]\.rtModels\[\d+\]\.peopleModel\[\d+\]/,
                                `dusunModels[${dusunIndex}].rwModels[${rwIndex}].rtModels[${rtIndex}].peopleModel[${wargaIndex}]`);

                            // Tetapkan kembali atribut 'name' yang telah diperbarui
                            $(this).attr('name', nameAttr);
                        });
                    });
                });
            });
        });
    });



    //add dusun
    $('#dusun-container').on('click', '.btn-add-dusun', function () {
        var dusunIndex = $('#dusun-container .dusun-card').length;

        let dusunElement = '<div class="dusun-card">\n' +
            '                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                    #Daftar Dusun\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-dusun" type="button">\n' +
            '        New Dusun\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-dusun" type="button">\n' +
            '        Remove Dusun\n' +
            '    </button>\n' +
            '</div>' +
            '                </h4>\n' +
            '                <div class="card mb-3">\n' +
            '                    <h5 class="card-header">#Dusun ' + (dusunIndex + 1) + '</h5>\n' +
            '                    <div class="card-body">\n' +
            '                        <div class="mb-3">\n' +
            '                            <label for="id_' + dusunIndex + '_name" class="form-label">Dusun Name</label>\n' +
            '                            <input type="text" class="form-control" id="id_' + dusunIndex + '_name" name="dusunModels[' + dusunIndex + '].name">\n' +
            '                        </div>\n' +
            '                        <div class="mb-3">\n' +
            '                            <label for="id_' + dusunIndex + '_dusunLeader" class="form-label">Leader Name</label>\n' +
            '                            <input type="text" class="form-control" id="id_' + dusunIndex + '_dusunLeader" name="dusunModels[' + dusunIndex + '].dusunLeader">\n' +
            '                        </div>\n' +
            '                        <div class="rw-container">\n' +
            '                            <div class="rw-card">\n' +
            '                                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                    #Daftar RW\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-rw" type="button">\n' +
            '        New RW\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-rw" type="button">\n' +
            '        Remove RW\n' +
            '    </button>\n' +
            '</div>' +
            '                                </h4>\n' +
            '                                <div class="card mb-3">\n' +
            '                                    <h5 class="card-header">#RW 1</h5>\n' +
            '                                    <div class="card-body">\n' +
            '                                        <div class="mb-3">\n' +
            '                                            <label for="id_' + dusunIndex + '_rwName" class="form-label">RW Name</label>\n' +
            '                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_rwName" name="dusunModels[' + dusunIndex + '].rwModels[0].name">\n' +
            '                                        </div>\n' +
            '                                        <div class="mb-3">\n' +
            '                                            <label for="id_' + dusunIndex + '_rwLeader" class="form-label">Leader Name</label>\n' +
            '                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_rwLeader" name="dusunModels[' + dusunIndex + '].rwModels[0].rwLeader">\n' +
            '                                        </div>\n' +
            '                                        <div class="rt-container">\n' +
            '                                            <div class="rt-card">\n' +
            '                                                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                    #Daftar RT\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-rt" type="button">\n' +
            '        New RT\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-rt" type="button">\n' +
            '        Remove RT\n' +
            '    </button>\n' +
            '</div>' +
            '                                                </h4>\n' +
            '                                                <div class="card mb-3">\n' +
            '                                                    <h5 class="card-header">#RT 1</h5>\n' +
            '                                                    <div class="card-body">\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_' + dusunIndex + '_rtName" class="form-label">RT Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_rtName" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].name">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_' + dusunIndex + '_rtLeader" class="form-label">Leader Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_rtLeader" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].rtLeader">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="warga-container">\n' +
            '                                                            <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                                #Daftar Warga\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-warga" type="button">\n' +
            '        New Warga\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-list-warga" type="button">\n' +
            '        Remove List Warga\n' +
            '    </button>\n' +
            '</div>' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
            '                                                                    <th>Action</th>\n' +
            '                                                                </tr>\n' +
            '                                                                </thead>\n' +
            '                                                                <tbody class="warga-body">\n' +
            '                                                                <tr class="warga-row">\n' +
            '                                                                    <th scope="row">1</th>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].peopleModel[0].nik">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].peopleModel[0].nama">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <select class="form-select" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].peopleModel[0].gender">\n' +
            '                                                                            <option value="" selected="" disabled="">Pilih Gender</option>\n' +
            '                                                                            <option value="Pria">Pria</option>\n' +
            '                                                                            <option value="Wanita">Wanita</option>\n' +
            '                                                                        </select>\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[0].rtModels[0].peopleModel[0].age">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <a class="btn btn-outline-danger btn-delete-warga">\n' +
            '                                                                            <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '                                                                        </a>\n' +
            '                                                                    </td>\n' +
            '                                                                </tr>\n' +
            '                                                                </tbody>\n' +
            '                                                            </table>\n' +
            '                                                        </div>\n' +
            '                                                    </div>\n' +
            '                                                </div>\n' +
            '                                            </div>\n' +
            '                                        </div>\n' +
            '                                    </div>\n' +
            '                                </div>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>';

        $('#dusun-container').append(dusunElement);
    });

    //add rw
    $('#dusun-container').on('click', '.btn-add-rw', function () {
        var dusunCard = $(this).closest('.dusun-card');
        var rwContainer = dusunCard.find('.rw-container');
        var dusunIndex = $('#dusun-container .dusun-card').index(dusunCard);
        var rwIndex = rwContainer.find('.rw-card').length;

        let rwElement = '<div class="rw-card">\n' +
            '                                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                    #Daftar RW\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-rw" type="button">\n' +
            '        New RW\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-rw" type="button">\n' +
            '        Remove RW\n' +
            '    </button>\n' +
            '</div>' +
            '                                </h4>\n' +
            '                                <div class="card mb-3">\n' +
            '                                    <h5 class="card-header">#RW ' + (rwIndex + 1) + '</h5>\n' +
            '                                    <div class="card-body">\n' +
            '                                        <div class="mb-3">\n' +
            '                                            <label for="id_' + dusunIndex + '_' + rwIndex + '_name" class="form-label">RW Name</label>\n' +
            '                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_name" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].name">\n' +
            '                                        </div>\n' +
            '                                        <div class="mb-3">\n' +
            '                                            <label for="id_' + dusunIndex + '_' + rwIndex + '_rwLeader" class="form-label">Leader Name</label>\n' +
            '                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_rwLeader" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rwLeader">\n' +
            '                                        </div>\n' +
            '                                        <div class="rt-container">\n' +
            '                                            <div class="rt-card">\n' +
            '                                                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                    #Daftar RT\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-rt" type="button">\n' +
            '        New RT\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-rt" type="button">\n' +
            '        Remove RT\n' +
            '    </button>\n' +
            '</div>' +
            '                                                </h4>\n' +
            '                                                <div class="card mb-3">\n' +
            '                                                    <h5 class="card-header">#RT 1</h5>\n' +
            '                                                    <div class="card-body">\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_' + dusunIndex + '_' + rwIndex + '_0_name" class="form-label">RT Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_0_name" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].name">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_' + dusunIndex + '_' + rwIndex + '_0_rtLeader" class="form-label">Leader Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_0_rtLeader" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].rtLeader">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="warga-container">\n' +
            '                                                            <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                                #Daftar Warga\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-warga" type="button">\n' +
            '        New Warga\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-list-warga" type="button">\n' +
            '        Remove List Warga\n' +
            '    </button>\n' +
            '</div>' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
            '                                                                    <th>Action</th>\n' +
            '                                                                </tr>\n' +
            '                                                                </thead>\n' +
            '                                                                <tbody class="warga-body">\n' +
            '                                                                <tr class="warga-row">\n' +
            '                                                                    <th scope="row">1</th>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].peopleModel[0].nik">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].peopleModel[0].nama">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <select class="form-select" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].peopleModel[0].gender">\n' +
            '                                                                            <option value="" selected="" disabled="">Pilih Gender</option>\n' +
            '                                                                            <option value="Pria">Pria</option>\n' +
            '                                                                            <option value="Wanita">Wanita</option>\n' +
            '                                                                        </select>\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[0].peopleModel[0].age">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <a class="btn btn-outline-danger btn-delete-warga">\n' +
            '                                                                            <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '                                                                        </a>\n' +
            '                                                                    </td>\n' +
            '                                                                </tr>\n' +
            '                                                                </tbody>\n' +
            '                                                            </table>\n' +
            '                                                        </div>\n' +
            '                                                    </div>\n' +
            '                                                </div>\n' +
            '                                            </div>\n' +
            '                                        </div>\n' +
            '                                    </div>\n' +
            '                                </div>\n' +
            '                            </div>';

        rwContainer.append(rwElement);
    });

    //add rt
    $('#dusun-container').on('click', '.btn-add-rt', function () {
        var dusunCard = $(this).closest('.dusun-card');
        var rwContainer = dusunCard.find('.rw-container');
        var rwCard = $(this).closest('.rw-card');
        var rtContainer = rwCard.find('.rt-container');
        var dusunIndex = $('#dusun-container .dusun-card').index(dusunCard);
        var rwIndex = rwContainer.find('.rw-card').index(rwCard);
        var rtIndex = rtContainer.find('.rt-card').length;

        let rtElement = '<div class="rt-card">\n' +
            '                                                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                    #Daftar RT\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-rt" type="button">\n' +
            '        New RT\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-rt" type="button">\n' +
            '        Remove RT\n' +
            '    </button>\n' +
            '</div>' +
            '                                                </h4>\n' +
            '                                                <div class="card mb-3">\n' +
            '                                                    <h5 class="card-header">#RT ' + (rtIndex + 1) + '</h5>\n' +
            '                                                    <div class="card-body">\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_'+ rtIndex +'_name" class="form-label">RT Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_'+ rtIndex +'_name" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].name">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="mb-3">\n' +
            '                                                            <label for="id_'+rtIndex+'_rtLeader" class="form-label">Leader Name</label>\n' +
            '                                                            <input type="text" class="form-control" id="id_'+ rtIndex +'_rtLeader" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].rtLeader">\n' +
            '                                                        </div>\n' +
            '                                                        <div class="warga-container">\n' +
            '                                                            <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                                                                #Daftar Warga\n' +
            '<div class="ms-auto">\n' +
            '    <button class="btn btn-outline-success ms-auto btn-add-warga" type="button">\n' +
            '        New Warga\n' +
            '    </button>\n' +
            '    <button class="btn btn-outline-danger ms-auto btn-delete-list-warga" type="button">\n' +
            '        Remove List Warga\n' +
            '    </button>\n' +
            '</div>' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
            '                                                                    <th>Action</th>\n' +
            '                                                                </tr>\n' +
            '                                                                </thead>\n' +
            '                                                                <tbody class="warga-body">\n' +
            '                                                                <tr class="warga-row">\n' +
            '                                                                    <th scope="row">1</th>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].peopleModel[0].nik">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].nama">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <select class="form-select" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].gender">\n' +
            '                                                                            <option value="" selected="" disabled="">Pilih Gender</option>\n' +
            '                                                                            <option value="Pria">Pria</option>\n' +
            '                                                                            <option value="Wanita">Wanita</option>\n' +
            '                                                                        </select>\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels['+ dusunIndex +'].rwModels['+ rwIndex +'].rtModels['+ rtIndex +'].age">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <a class="btn btn-outline-danger btn-delete-warga">\n' +
            '                                                                            <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '                                                                        </a>\n' +
            '                                                                    </td>\n' +
            '                                                                </tr>\n' +
            '                                                                </tbody>\n' +
            '                                                            </table>\n' +
            '                                                        </div>\n' +
            '                                                    </div>\n' +
            '                                                </div>\n' +
            '                                            </div>';

        rtContainer.append(rtElement);
    });

    //add warga
    $('#dusun-container').on('click', '.btn-add-warga', function () {
        var dusunCard = $(this).closest('.dusun-card');
        var rwContainer = dusunCard.find('.rw-container');
        var rwCard = $(this).closest('.rw-card');
        var rtContainer = rwCard.find('.rt-container');
        var rtCard = $(this).closest('.rt-card');
        var wargaContainer = rtCard.find('.warga-container');
        var dusunIndex = $('#dusun-container .dusun-card').index(dusunCard);
        var rwIndex = rwContainer.find('.rw-card').index(rwCard);
        var rtIndex = rtContainer.find('.rt-card').index(rtCard);
        var wargaIndex = wargaContainer.find('.warga-row').length;

        let wargaElement = '<tr class="warga-row">\n' +
            '                                                                    <th scope="row">'+ (wargaIndex + 1) +'</th>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[' + rtIndex + '].peopleModel[' + wargaIndex + '].nik">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[' + rtIndex + '].peopleModel[' + wargaIndex + '].nama">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <select class="form-select" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[' + rtIndex + '].peopleModel[' + wargaIndex + '].gender">\n' +
            '                                                                            <option value="" selected="" disabled="">Pilih Gender</option>\n' +
            '                                                                            <option value="Pria">Pria</option>\n' +
            '                                                                            <option value="Wanita">Wanita</option>\n' +
            '                                                                        </select>\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <input type="text" class="form-control" name="dusunModels[' + dusunIndex + '].rwModels[' + rwIndex + '].rtModels[' + rtIndex + '].peopleModel[' + wargaIndex + '].age">\n' +
            '                                                                    </td>\n' +
            '                                                                    <td>\n' +
            '                                                                        <a class="btn btn-outline-danger btn-delete-warga">\n' +
            '                                                                            <i class="bi bi-trash3-fill"></i>&nbsp;Delete\n' +
            '                                                                        </a>\n' +
            '                                                                    </td>\n' +
            '                                                                </tr>';

        wargaContainer.find('.warga-body').append(wargaElement);
    });
});