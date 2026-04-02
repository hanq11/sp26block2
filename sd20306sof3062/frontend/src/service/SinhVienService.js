const baseUrl = "http://localhost:8080/sinh-vien"

export const fetchAllSinhVien = async () => {
    const response = await fetch(`${baseUrl}/hien-thi`);
    if(!response.ok) {
        throw new Error(response.status + ": " + await response.text())
    }
    return await response.json();
}
