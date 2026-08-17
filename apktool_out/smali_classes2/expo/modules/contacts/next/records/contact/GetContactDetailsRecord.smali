.class public final Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00089\u0018\u00002\u00020\u0001B\u00d9\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0017\u0012\u0010\u0008\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0017\u00a2\u0006\u0004\u0008%\u0010&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008+\u0010(\u001a\u0004\u0008,\u0010*R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008-\u0010(\u001a\u0004\u0008.\u0010*R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008/\u0010(\u001a\u0004\u00080\u0010*R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00081\u0010(\u001a\u0004\u00082\u0010*R\u001e\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00083\u0010(\u001a\u0004\u00084\u0010*R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00085\u0010(\u001a\u0004\u00086\u0010*R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00087\u0010(\u001a\u0004\u00088\u0010*R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00089\u0010(\u001a\u0004\u0008:\u0010*R\u001e\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008;\u0010(\u001a\u0004\u0008<\u0010*R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008=\u0010(\u001a\u0004\u0008>\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008?\u0010(\u001a\u0004\u0008@\u0010*R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008A\u0010(\u001a\u0004\u0008B\u0010*R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008C\u0010(\u001a\u0004\u0008D\u0010*R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008E\u0010(\u001a\u0004\u0008F\u0010*R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008G\u0010(\u001a\u0004\u0008H\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008I\u0010(\u001a\u0004\u0008J\u0010*R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010M\u0012\u0004\u0008K\u0010(\u001a\u0004\u0008\u0014\u0010LR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008N\u0010(\u001a\u0004\u0008O\u0010PR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008Q\u0010(\u001a\u0004\u0008R\u0010PR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008S\u0010(\u001a\u0004\u0008T\u0010PR$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008U\u0010(\u001a\u0004\u0008V\u0010PR$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008W\u0010(\u001a\u0004\u0008X\u0010PR$\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008Y\u0010(\u001a\u0004\u0008Z\u0010PR$\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008[\u0010(\u001a\u0004\u0008\\\u0010P\u00a8\u0006]"
    }
    d2 = {
        "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
        "Lexpo/modules/kotlin/records/Record;",
        "id",
        "",
        "fullName",
        "givenName",
        "middleName",
        "familyName",
        "prefix",
        "suffix",
        "phoneticGivenName",
        "phoneticMiddleName",
        "phoneticFamilyName",
        "company",
        "department",
        "jobTitle",
        "phoneticCompanyName",
        "note",
        "image",
        "thumbnail",
        "isFavourite",
        "",
        "emails",
        "",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
        "dates",
        "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
        "phones",
        "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;",
        "addresses",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
        "relations",
        "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;",
        "urlAddresses",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
        "extraNames",
        "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getId$annotations",
        "()V",
        "getId",
        "()Ljava/lang/String;",
        "getFullName$annotations",
        "getFullName",
        "getGivenName$annotations",
        "getGivenName",
        "getMiddleName$annotations",
        "getMiddleName",
        "getFamilyName$annotations",
        "getFamilyName",
        "getPrefix$annotations",
        "getPrefix",
        "getSuffix$annotations",
        "getSuffix",
        "getPhoneticGivenName$annotations",
        "getPhoneticGivenName",
        "getPhoneticMiddleName$annotations",
        "getPhoneticMiddleName",
        "getPhoneticFamilyName$annotations",
        "getPhoneticFamilyName",
        "getCompany$annotations",
        "getCompany",
        "getDepartment$annotations",
        "getDepartment",
        "getJobTitle$annotations",
        "getJobTitle",
        "getPhoneticCompanyName$annotations",
        "getPhoneticCompanyName",
        "getNote$annotations",
        "getNote",
        "getImage$annotations",
        "getImage",
        "getThumbnail$annotations",
        "getThumbnail",
        "isFavourite$annotations",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getEmails$annotations",
        "getEmails",
        "()Ljava/util/List;",
        "getDates$annotations",
        "getDates",
        "getPhones$annotations",
        "getPhones",
        "getAddresses$annotations",
        "getAddresses",
        "getRelations$annotations",
        "getRelations",
        "getUrlAddresses$annotations",
        "getUrlAddresses",
        "getExtraNames$annotations",
        "getExtraNames",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final addresses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final company:Ljava/lang/String;

.field private final dates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final department:Ljava/lang/String;

.field private final emails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final extraNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final familyName:Ljava/lang/String;

.field private final fullName:Ljava/lang/String;

.field private final givenName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final isFavourite:Ljava/lang/Boolean;

.field private final jobTitle:Ljava/lang/String;

.field private final middleName:Ljava/lang/String;

.field private final note:Ljava/lang/String;

.field private final phones:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneticCompanyName:Ljava/lang/String;

.field private final phoneticFamilyName:Ljava/lang/String;

.field private final phoneticGivenName:Ljava/lang/String;

.field private final phoneticMiddleName:Ljava/lang/String;

.field private final prefix:Ljava/lang/String;

.field private final relations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;",
            ">;"
        }
    .end annotation
.end field

.field private final suffix:Ljava/lang/String;

.field private final thumbnail:Ljava/lang/String;

.field private final urlAddresses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
            ">;",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->fullName:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->givenName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->middleName:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->familyName:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->prefix:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->suffix:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticGivenName:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticMiddleName:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticFamilyName:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->company:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->department:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->jobTitle:Ljava/lang/String;

    .line 15
    iput-object p14, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticCompanyName:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->note:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->image:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->thumbnail:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->isFavourite:Ljava/lang/Boolean;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->emails:Ljava/util/List;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->dates:Ljava/util/List;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phones:Ljava/util/List;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->addresses:Ljava/util/List;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->relations:Ljava/util/List;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->urlAddresses:Ljava/util/List;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->extraNames:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p26

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_9

    move-object v11, v2

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_a

    move-object v12, v2

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_b

    move-object v13, v2

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    move-object v15, v2

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_e

    move-object/from16 v16, v2

    goto :goto_e

    :cond_e
    move-object/from16 v16, p16

    :goto_e
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_f

    move-object/from16 v17, v2

    goto :goto_f

    :cond_f
    move-object/from16 v17, p17

    :goto_f
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_10

    goto :goto_10

    :cond_10
    move-object/from16 v2, p18

    :goto_10
    const/high16 v18, 0x40000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    .line 27
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v18

    goto :goto_11

    :cond_11
    move-object/from16 v18, p19

    :goto_11
    const/high16 v19, 0x80000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    .line 28
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v19

    goto :goto_12

    :cond_12
    move-object/from16 v19, p20

    :goto_12
    const/high16 v20, 0x100000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    .line 29
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v20

    goto :goto_13

    :cond_13
    move-object/from16 v20, p21

    :goto_13
    const/high16 v21, 0x200000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    .line 30
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v21

    goto :goto_14

    :cond_14
    move-object/from16 v21, p22

    :goto_14
    const/high16 v22, 0x400000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    .line 31
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v22

    goto :goto_15

    :cond_15
    move-object/from16 v22, p23

    :goto_15
    const/high16 v23, 0x800000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    .line 32
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v23

    goto :goto_16

    :cond_16
    move-object/from16 v23, p24

    :goto_16
    const/high16 v24, 0x1000000

    and-int v0, v0, v24

    if-eqz v0, :cond_17

    .line 33
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object v0

    move-object/from16 p27, v0

    :goto_17
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p20, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move-object/from16 p14, v12

    move-object/from16 p15, v13

    move-object/from16 p16, v14

    move-object/from16 p17, v15

    move-object/from16 p18, v16

    move-object/from16 p19, v17

    move-object/from16 p21, v18

    move-object/from16 p22, v19

    move-object/from16 p23, v20

    move-object/from16 p24, v21

    move-object/from16 p25, v22

    move-object/from16 p26, v23

    goto :goto_18

    :cond_17
    move-object/from16 p27, p25

    goto :goto_17

    .line 34
    :goto_18
    invoke-direct/range {p2 .. p27}, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic getAddresses$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getCompany$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getDates$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getDepartment$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getEmails$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getExtraNames$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getFamilyName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getFullName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getGivenName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getImage$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getJobTitle$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getMiddleName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getNote$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPhones$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPhoneticCompanyName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPhoneticFamilyName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPhoneticGivenName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPhoneticMiddleName$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getPrefix$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getRelations$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSuffix$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getThumbnail$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getUrlAddresses$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic isFavourite$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getAddresses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->addresses:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompany()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->company:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->dates:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDepartment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->department:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEmails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->emails:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExtraNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->extraNames:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFamilyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->familyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFullName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->fullName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGivenName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->givenName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->image:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJobTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->jobTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMiddleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->middleName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNote()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->note:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhones()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phones:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticCompanyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticCompanyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticFamilyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticFamilyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticGivenName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticGivenName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticMiddleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->phoneticMiddleName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRelations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->relations:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThumbnail()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->thumbnail:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUrlAddresses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->urlAddresses:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isFavourite()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;->isFavourite:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method
