<template>
    <div class="container">
        <form>
            <div class="row">
                <div class="mb-3 col">
                    <label for="id" class="form-label">Id</label>
                    <input type="text" class="form-control" id="id" aria-describedby="id">
                </div>
                <div class="mb-3 col">
                    <label for="ten" class="form-label">Ten</label>
                    <input type="text" class="form-control" id="ten" aria-describedby="ten">
                </div>
            </div>
            <div class="row">
                <div class="mb-3 col">
                    <label for="tuoi" class="form-label">Tuoi</label>
                    <input type="text" class="form-control" id="tuoi" aria-describedby="tuoi">
                </div>
                <div class="mb-3 col">
                    <label for="ngaySinh" class="form-label">NgaySinh</label>
                    <input type="text" class="form-control" id="ngaySinh" aria-describedby="ngaySinh">
                </div>
            </div>
            <div class="row">
                <div class="mb-3 col">
                    <label for="gioiTinh" class="form-label">GioiTinh:</label>
                    <input class="form-check-input ms-3" type="radio" name="gioiTinh" id="radioDefault1" value="true">
                    <label class="form-check-label" for="radioDefault1">
                        Nam
                    </label>
                    <input class="form-check-input ms-3" type="radio" name="gioiTinh" id="radioDefault2" value="false">
                    <label class="form-check-label" for="radioDefault2">
                        Nu
                    </label>
                </div>
                <div class="mb-3 col">
                    <label for="lopHoc" class="form-label">LopHoc</label>
                    <input type="email" class="form-control" id="lopHoc" aria-describedby="lopHoc">
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <h2 class="text-center">Bang sinh vien</h2>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">ten</th>
                    <th scope="col">tuoi</th>
                    <th scope="col">ngaySinh</th>
                    <th scope="col">gioiTinh</th>
                    <th scope="col">lopHoc</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="sv in listSinhVien">
                    <td>{{ sv.id }}</td>
                    <td>{{ sv.ten }}</td>
                    <td>{{ sv.tuoi }}</td>
                    <td>{{ sv.ngaySinh }}</td>
                    <td>{{ sv.gioiTinh }}</td>
                    <td>{{ sv.lopHoc }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import { fetchAllSinhVien } from '@/service/SinhVienService';

let listSinhVien = ref({});
const loadAllData = async () => {
    try {
        listSinhVien.value = await fetchAllSinhVien();
    } catch (e) {
        console.log(e)
    }
}

onMounted(loadAllData)
</script>