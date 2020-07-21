package com.lenovo.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class WxMachine implements Serializable {
    private Long id;

    /**
     * 主机编号
     */
    private String machineNo;

    /**
     * 产品线ID(暂无用)
     */
    private String productline;

    /**
     * 产品线名称
     */
    private String productlinename;

    /**
     * 产品大类ID(暂无用)
     */
    private String machineclassid;

    /**
     * 产品大类名称(1级)
     */
    private String machineclassname;

    /**
     * 产品小类名称(2级)
     */
    private String subclassname;

    /**
     * 产品系列名称(3级)
     */
    private String machineserialname;

    /**
     * 产品型号名称(4级)
     */
    private String modeltypename;

    /**
     * 物料编号(暂无用)
     */
    private String materialno;

    /**
     * 主机名称
     */
    private String machineName;

    /**
     * 机型归属
     */
    private String brandtypeid;

    /**
     * 物料名称(暂无用)
     */
    private String materialname;

    /**
     * Think查询驱动所需TreeID(已淘汰)
     */
    private String treeid;

    /**
     * 1:会员,2:保修查询,3:其它,4:查询主机保修配置,5:工程师绑定用户主机号,6:网上报修,7:预约送修,8:ec3绑定,15:商品扫一扫,16:商用专区绑定,17:一机一码绑定商用产品
     */
    private String source;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String memo;

    /**
     * 是否删除 0未是删除 1 已删除
     */
    private Boolean isDelete;

    /**
     * 保修截止时间
     */
    private Date warrantyDate;

    private String treepic;

    private Date onsiteenddate;

    private String productType;

    private String catalogname;

    private String isdisplaydevice;

    private String ishost;

    private String modeltype;

    private String modeltypeid;

    private Date productdate;

    private Date scandate;

    private String webtreename;

    private String salearea;

    private Integer flag;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo == null ? null : machineNo.trim();
    }

    public String getProductline() {
        return productline;
    }

    public void setProductline(String productline) {
        this.productline = productline == null ? null : productline.trim();
    }

    public String getProductlinename() {
        return productlinename;
    }

    public void setProductlinename(String productlinename) {
        this.productlinename = productlinename == null ? null : productlinename.trim();
    }

    public String getMachineclassid() {
        return machineclassid;
    }

    public void setMachineclassid(String machineclassid) {
        this.machineclassid = machineclassid == null ? null : machineclassid.trim();
    }

    public String getMachineclassname() {
        return machineclassname;
    }

    public void setMachineclassname(String machineclassname) {
        this.machineclassname = machineclassname == null ? null : machineclassname.trim();
    }

    public String getSubclassname() {
        return subclassname;
    }

    public void setSubclassname(String subclassname) {
        this.subclassname = subclassname == null ? null : subclassname.trim();
    }

    public String getMachineserialname() {
        return machineserialname;
    }

    public void setMachineserialname(String machineserialname) {
        this.machineserialname = machineserialname == null ? null : machineserialname.trim();
    }

    public String getModeltypename() {
        return modeltypename;
    }

    public void setModeltypename(String modeltypename) {
        this.modeltypename = modeltypename == null ? null : modeltypename.trim();
    }

    public String getMaterialno() {
        return materialno;
    }

    public void setMaterialno(String materialno) {
        this.materialno = materialno == null ? null : materialno.trim();
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName == null ? null : machineName.trim();
    }

    public String getBrandtypeid() {
        return brandtypeid;
    }

    public void setBrandtypeid(String brandtypeid) {
        this.brandtypeid = brandtypeid == null ? null : brandtypeid.trim();
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getTreeid() {
        return treeid;
    }

    public void setTreeid(String treeid) {
        this.treeid = treeid == null ? null : treeid.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(Date warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public String getTreepic() {
        return treepic;
    }

    public void setTreepic(String treepic) {
        this.treepic = treepic == null ? null : treepic.trim();
    }

    public Date getOnsiteenddate() {
        return onsiteenddate;
    }

    public void setOnsiteenddate(Date onsiteenddate) {
        this.onsiteenddate = onsiteenddate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getCatalogname() {
        return catalogname;
    }

    public void setCatalogname(String catalogname) {
        this.catalogname = catalogname == null ? null : catalogname.trim();
    }

    public String getIsdisplaydevice() {
        return isdisplaydevice;
    }

    public void setIsdisplaydevice(String isdisplaydevice) {
        this.isdisplaydevice = isdisplaydevice == null ? null : isdisplaydevice.trim();
    }

    public String getIshost() {
        return ishost;
    }

    public void setIshost(String ishost) {
        this.ishost = ishost == null ? null : ishost.trim();
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    public String getModeltypeid() {
        return modeltypeid;
    }

    public void setModeltypeid(String modeltypeid) {
        this.modeltypeid = modeltypeid == null ? null : modeltypeid.trim();
    }

    public Date getProductdate() {
        return productdate;
    }

    public void setProductdate(Date productdate) {
        this.productdate = productdate;
    }

    public Date getScandate() {
        return scandate;
    }

    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    public String getWebtreename() {
        return webtreename;
    }

    public void setWebtreename(String webtreename) {
        this.webtreename = webtreename == null ? null : webtreename.trim();
    }

    public String getSalearea() {
        return salearea;
    }

    public void setSalearea(String salearea) {
        this.salearea = salearea == null ? null : salearea.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", machineNo=").append(machineNo);
        sb.append(", productline=").append(productline);
        sb.append(", productlinename=").append(productlinename);
        sb.append(", machineclassid=").append(machineclassid);
        sb.append(", machineclassname=").append(machineclassname);
        sb.append(", subclassname=").append(subclassname);
        sb.append(", machineserialname=").append(machineserialname);
        sb.append(", modeltypename=").append(modeltypename);
        sb.append(", materialno=").append(materialno);
        sb.append(", machineName=").append(machineName);
        sb.append(", brandtypeid=").append(brandtypeid);
        sb.append(", materialname=").append(materialname);
        sb.append(", treeid=").append(treeid);
        sb.append(", source=").append(source);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", memo=").append(memo);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", warrantyDate=").append(warrantyDate);
        sb.append(", treepic=").append(treepic);
        sb.append(", onsiteenddate=").append(onsiteenddate);
        sb.append(", productType=").append(productType);
        sb.append(", catalogname=").append(catalogname);
        sb.append(", isdisplaydevice=").append(isdisplaydevice);
        sb.append(", ishost=").append(ishost);
        sb.append(", modeltype=").append(modeltype);
        sb.append(", modeltypeid=").append(modeltypeid);
        sb.append(", productdate=").append(productdate);
        sb.append(", scandate=").append(scandate);
        sb.append(", webtreename=").append(webtreename);
        sb.append(", salearea=").append(salearea);
        sb.append(", flag=").append(flag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WxMachine other = (WxMachine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMachineNo() == null ? other.getMachineNo() == null : this.getMachineNo().equals(other.getMachineNo()))
            && (this.getProductline() == null ? other.getProductline() == null : this.getProductline().equals(other.getProductline()))
            && (this.getProductlinename() == null ? other.getProductlinename() == null : this.getProductlinename().equals(other.getProductlinename()))
            && (this.getMachineclassid() == null ? other.getMachineclassid() == null : this.getMachineclassid().equals(other.getMachineclassid()))
            && (this.getMachineclassname() == null ? other.getMachineclassname() == null : this.getMachineclassname().equals(other.getMachineclassname()))
            && (this.getSubclassname() == null ? other.getSubclassname() == null : this.getSubclassname().equals(other.getSubclassname()))
            && (this.getMachineserialname() == null ? other.getMachineserialname() == null : this.getMachineserialname().equals(other.getMachineserialname()))
            && (this.getModeltypename() == null ? other.getModeltypename() == null : this.getModeltypename().equals(other.getModeltypename()))
            && (this.getMaterialno() == null ? other.getMaterialno() == null : this.getMaterialno().equals(other.getMaterialno()))
            && (this.getMachineName() == null ? other.getMachineName() == null : this.getMachineName().equals(other.getMachineName()))
            && (this.getBrandtypeid() == null ? other.getBrandtypeid() == null : this.getBrandtypeid().equals(other.getBrandtypeid()))
            && (this.getMaterialname() == null ? other.getMaterialname() == null : this.getMaterialname().equals(other.getMaterialname()))
            && (this.getTreeid() == null ? other.getTreeid() == null : this.getTreeid().equals(other.getTreeid()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getWarrantyDate() == null ? other.getWarrantyDate() == null : this.getWarrantyDate().equals(other.getWarrantyDate()))
            && (this.getTreepic() == null ? other.getTreepic() == null : this.getTreepic().equals(other.getTreepic()))
            && (this.getOnsiteenddate() == null ? other.getOnsiteenddate() == null : this.getOnsiteenddate().equals(other.getOnsiteenddate()))
            && (this.getProductType() == null ? other.getProductType() == null : this.getProductType().equals(other.getProductType()))
            && (this.getCatalogname() == null ? other.getCatalogname() == null : this.getCatalogname().equals(other.getCatalogname()))
            && (this.getIsdisplaydevice() == null ? other.getIsdisplaydevice() == null : this.getIsdisplaydevice().equals(other.getIsdisplaydevice()))
            && (this.getIshost() == null ? other.getIshost() == null : this.getIshost().equals(other.getIshost()))
            && (this.getModeltype() == null ? other.getModeltype() == null : this.getModeltype().equals(other.getModeltype()))
            && (this.getModeltypeid() == null ? other.getModeltypeid() == null : this.getModeltypeid().equals(other.getModeltypeid()))
            && (this.getProductdate() == null ? other.getProductdate() == null : this.getProductdate().equals(other.getProductdate()))
            && (this.getScandate() == null ? other.getScandate() == null : this.getScandate().equals(other.getScandate()))
            && (this.getWebtreename() == null ? other.getWebtreename() == null : this.getWebtreename().equals(other.getWebtreename()))
            && (this.getSalearea() == null ? other.getSalearea() == null : this.getSalearea().equals(other.getSalearea()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMachineNo() == null) ? 0 : getMachineNo().hashCode());
        result = prime * result + ((getProductline() == null) ? 0 : getProductline().hashCode());
        result = prime * result + ((getProductlinename() == null) ? 0 : getProductlinename().hashCode());
        result = prime * result + ((getMachineclassid() == null) ? 0 : getMachineclassid().hashCode());
        result = prime * result + ((getMachineclassname() == null) ? 0 : getMachineclassname().hashCode());
        result = prime * result + ((getSubclassname() == null) ? 0 : getSubclassname().hashCode());
        result = prime * result + ((getMachineserialname() == null) ? 0 : getMachineserialname().hashCode());
        result = prime * result + ((getModeltypename() == null) ? 0 : getModeltypename().hashCode());
        result = prime * result + ((getMaterialno() == null) ? 0 : getMaterialno().hashCode());
        result = prime * result + ((getMachineName() == null) ? 0 : getMachineName().hashCode());
        result = prime * result + ((getBrandtypeid() == null) ? 0 : getBrandtypeid().hashCode());
        result = prime * result + ((getMaterialname() == null) ? 0 : getMaterialname().hashCode());
        result = prime * result + ((getTreeid() == null) ? 0 : getTreeid().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getWarrantyDate() == null) ? 0 : getWarrantyDate().hashCode());
        result = prime * result + ((getTreepic() == null) ? 0 : getTreepic().hashCode());
        result = prime * result + ((getOnsiteenddate() == null) ? 0 : getOnsiteenddate().hashCode());
        result = prime * result + ((getProductType() == null) ? 0 : getProductType().hashCode());
        result = prime * result + ((getCatalogname() == null) ? 0 : getCatalogname().hashCode());
        result = prime * result + ((getIsdisplaydevice() == null) ? 0 : getIsdisplaydevice().hashCode());
        result = prime * result + ((getIshost() == null) ? 0 : getIshost().hashCode());
        result = prime * result + ((getModeltype() == null) ? 0 : getModeltype().hashCode());
        result = prime * result + ((getModeltypeid() == null) ? 0 : getModeltypeid().hashCode());
        result = prime * result + ((getProductdate() == null) ? 0 : getProductdate().hashCode());
        result = prime * result + ((getScandate() == null) ? 0 : getScandate().hashCode());
        result = prime * result + ((getWebtreename() == null) ? 0 : getWebtreename().hashCode());
        result = prime * result + ((getSalearea() == null) ? 0 : getSalearea().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        return result;
    }
}