/*==============================================================*/
/* Table: campaigns                                             */
/*==============================================================*/
create table campaigns (
  campaign_id          INT                  not null,
  name                 VARCHAR(60)              null,
  start_date           TIMESTAMP            not null,
  finish_date          TIMESTAMP            not null,
  status               INT                  not null,
  constraint PK_CAMPAIGNS primary key (campaign_id)
);

/*==============================================================*/
/* Index: CAMPAIGN_NAME_IND                                     */
/*==============================================================*/
create  index CAMPAIGN_NAME_IND on campaigns (
  name
);

/*==============================================================*/
/* Index: CAMPAIGN_STATUS_IND                                   */
/*==============================================================*/
create  index CAMPAIGN_STATUS_IND on campaigns (
  status
);

/*==============================================================*/
/* Table: ads                                                   */
/*==============================================================*/
create table ads (
  ad_id                INT                 not null,
  campaign_id          INT                 not null,
  asset_url            VARCHAR(60)         not null,
  platforms            VARCHAR(10)         not null,
  name                 VARCHAR(60)             null,
  status               INT                 not null,
  constraint PK_ADS primary key (ad_id, campaign_id)
);

/*==============================================================*/
/* Index: AD_NAME_IND                                           */
/*==============================================================*/
create  index AD_NAME_IND on ads (
  name
);

/*==============================================================*/
/* Index: AD_STATUS_IND                                         */
/*==============================================================*/
create  index AD_STATUS_IND on ads (
  status
);

alter table ads
  add constraint FK_ADS_FK_ADS_RE_CAMPAIGN foreign key (campaign_id)
references campaigns (campaign_id)
  on delete restrict on update restrict;