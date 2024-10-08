$(document).ready(function () {

    //add dusun
    $('#dusun-container').on('click', '.btn-add-dusun', function () {
        var dusunIndex = $('#dusun-container .dusun-card').length;

        let dusunElement = '<div class="dusun-card">\n' +
            '                <h4 class="d-flex justify-content-between align-items-center">\n' +
            '                    #Daftar Dusun\n' +
            '                    <button class="btn btn-outline-dark ms-auto btn-add-dusun" type="button">\n' +
            '                        New Dusun\n' +
            '                    </button>\n' +
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
            '                                    <button class="btn btn-outline-dark ms-auto btn-add-rw" type="button">\n' +
            '                                        New RW\n' +
            '                                    </button>\n' +
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
            '                                                    <button class="btn btn-outline-dark ms-auto btn-add-rt" type="button">\n' +
            '                                                        New RT\n' +
            '                                                    </button>\n' +
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
            '                                                                <button class="btn btn-outline-dark ms-auto btn-add-warga" type="button">\n' +
            '                                                                    New Warga\n' +
            '                                                                </button>\n' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
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
            '                                    <button class="btn btn-outline-dark ms-auto btn-add-rw" type="button">\n' +
            '                                        New RW\n' +
            '                                    </button>\n' +
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
            '                                                    <button class="btn btn-outline-dark ms-auto btn-add-rt" type="button">\n' +
            '                                                        New RT\n' +
            '                                                    </button>\n' +
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
            '                                                                <button class="btn btn-outline-dark ms-auto btn-add-warga" type="button">\n' +
            '                                                                    New Warga\n' +
            '                                                                </button>\n' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
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
            '                                                    <button class="btn btn-outline-dark ms-auto btn-add-rt" type="button">\n' +
            '                                                        New RT\n' +
            '                                                    </button>\n' +
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
            '                                                                <button class="btn btn-outline-dark ms-auto btn-add-warga" type="button">\n' +
            '                                                                    New Warga\n' +
            '                                                                </button>\n' +
            '                                                            </h4>\n' +
            '                                                            <table class="table table-bordered table-hover">\n' +
            '                                                                <thead>\n' +
            '                                                                <tr>\n' +
            '                                                                    <th>No</th>\n' +
            '                                                                    <th>NIK</th>\n' +
            '                                                                    <th>Name</th>\n' +
            '                                                                    <th>Gender</th>\n' +
            '                                                                    <th>Age</th>\n' +
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
            '                                                                </tr>';

        wargaContainer.find('.warga-body').append(wargaElement);
    });
});