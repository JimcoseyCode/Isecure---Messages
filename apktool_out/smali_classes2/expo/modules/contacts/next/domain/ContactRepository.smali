.class public final Lexpo/modules/contacts/next/domain/ContactRepository;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J0\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\t0\u0008H\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010%\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020!H\u0086@\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020&H\u0086@\u00a2\u0006\u0004\u0008\u001c\u0010(J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008*\u0010\u001fJF\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/2\n\u0008\u0002\u00102\u001a\u0004\u0018\u000101H\u0086@\u00a2\u0006\u0004\u00083\u00104J,\u00109\u001a\u0004\u0018\u0001062\u0010\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u0003050\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u00087\u00108JX\u0010;\u001a\u0008\u0012\u0004\u0012\u0002060:2\u0010\u0010\n\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u0003050\u00082\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010,2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/2\n\u0008\u0002\u00102\u001a\u0004\u0018\u000101H\u0086@\u00a2\u0006\u0004\u0008;\u0010<J6\u0010B\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0008\u0008\u0000\u0010>*\u00020=2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008@\u0010AJ2\u0010G\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010>*\u00020C2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010H\u001a\u00020,H\u0086@\u00a2\u0006\u0004\u0008H\u0010IJ\u001a\u0010K\u001a\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008J\u0010\u001fJ\u001a\u0010N\u001a\u0004\u0018\u00010L2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008M\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010O\u001a\u0004\u0008P\u0010Q\u00a8\u0006R"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "<init>",
        "(Landroid/content/ContentResolver;)V",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "contactId",
        "",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "extractableFields",
        "",
        "Lexpo/modules/contacts/next/domain/wrappers/DataId;",
        "getDataIds-0xh38yw",
        "(Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;",
        "getDataIds",
        "Lexpo/modules/contacts/next/domain/model/contact/NewContact;",
        "contact",
        "insert-Hoartsk",
        "(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Ln7/f;)Ljava/lang/Object;",
        "insert",
        "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
        "contactPatch",
        "",
        "patch",
        "(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;",
        "updateContact",
        "update",
        "(Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;Ln7/f;)Ljava/lang/Object;",
        "delete-D2TBaGg",
        "(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "delete",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "appendable",
        "append-4zbj8jY",
        "(Lexpo/modules/contacts/next/domain/model/Appendable;Ln7/f;)Ljava/lang/Object;",
        "append",
        "Lexpo/modules/contacts/next/domain/model/Updatable;",
        "updatable",
        "(Lexpo/modules/contacts/next/domain/model/Updatable;Ln7/f;)Ljava/lang/Object;",
        "dataId",
        "deleteFieldEntry-bM46d30",
        "deleteFieldEntry",
        "",
        "limit",
        "offset",
        "",
        "searchedDisplayName",
        "Lexpo/modules/contacts/next/records/SortOrder;",
        "sortOrder",
        "getAllIds",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField;",
        "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;",
        "getById-m7AL99Q",
        "(Ljava/util/Set;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "getById",
        "",
        "getAllPaginated",
        "(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
        "T",
        "extractableField",
        "getFieldFromData-m7AL99Q",
        "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "getFieldFromData",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;",
        "getFieldFromContacts-m7AL99Q",
        "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
        "getFieldFromContacts",
        "getCount",
        "(Ln7/f;)Ljava/lang/Object;",
        "getLookupKey-D2TBaGg",
        "getLookupKey",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "getRawContactId-K3SHF88",
        "getRawContactId",
        "Landroid/content/ContentResolver;",
        "getContentResolver",
        "()Landroid/content/ContentResolver;",
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
.field private final contentResolver:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 1

    .line 1
    const-string v0, "contentResolver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository;->contentResolver:Landroid/content/ContentResolver;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic access$getDataIds-0xh38yw(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/contacts/next/domain/ContactRepository;->getDataIds-0xh38yw(Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic getAllIds$default(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 18
    .line 19
    if-eqz p6, :cond_3

    .line 20
    .line 21
    sget-object p4, Lexpo/modules/contacts/next/records/SortOrder;->UserDefault:Lexpo/modules/contacts/next/records/SortOrder;

    .line 22
    .line 23
    :cond_3
    invoke-virtual/range {p0 .. p5}, Lexpo/modules/contacts/next/domain/ContactRepository;->getAllIds(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static synthetic getAllPaginated$default(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x4

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x8

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    and-int/lit8 p7, p7, 0x10

    .line 18
    .line 19
    if-eqz p7, :cond_3

    .line 20
    .line 21
    move-object p5, v0

    .line 22
    :cond_3
    invoke-virtual/range {p0 .. p6}, Lexpo/modules/contacts/next/domain/ContactRepository;->getAllPaginated(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private final getDataIds-0xh38yw(Ljava/lang/String;Ljava/util/Set;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "*>;>;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getDataIds$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p2, p0, p1, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getDataIds$2;-><init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method


# virtual methods
.method public final append-4zbj8jY(Lexpo/modules/contacts/next/domain/model/Appendable;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance v2, Lexpo/modules/contacts/next/domain/ContactRepository$append$2;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, p1, p0, v4}, Lexpo/modules/contacts/next/domain/ContactRepository$append$2;-><init>(Lexpo/modules/contacts/next/domain/model/Appendable;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 61
    .line 62
    .line 63
    iput v3, v0, Lexpo/modules/contacts/next/domain/ContactRepository$append$1;->label:I

    .line 64
    .line 65
    invoke-static {p2, v2, v0}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/DataId;

    .line 73
    .line 74
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->unbox-impl()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final delete-D2TBaGg(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository;->contentResolver:Landroid/content/ContentResolver;

    .line 54
    .line 55
    sget-object v2, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    .line 56
    .line 57
    const-string v4, "CONTENT_URI"

    .line 58
    .line 59
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    filled-new-array {p1}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput v3, v0, Lexpo/modules/contacts/next/domain/ContactRepository$delete$1;->label:I

    .line 67
    .line 68
    const-string v4, "contact_id = ?"

    .line 69
    .line 70
    invoke-static {p2, v2, v4, p1, v0}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeDelete(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-lez p1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    const/4 v3, 0x0

    .line 87
    :goto_2
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final deleteFieldEntry-bM46d30(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$deleteFieldEntry$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$deleteFieldEntry$2;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getAllIds(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/records/SortOrder;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getAllIds$2;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v2, p0

    .line 9
    move-object v6, p1

    .line 10
    move-object v5, p2

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v1 .. v7}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllIds$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ljava/lang/Integer;Ljava/lang/Integer;Ln7/f;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p5}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final getAllPaginated(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/records/SortOrder;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    move-object v3, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v6, p2

    .line 11
    move-object v7, p3

    .line 12
    move-object v4, p4

    .line 13
    move-object v5, p5

    .line 14
    invoke-direct/range {v1 .. v8}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;-><init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ljava/lang/Integer;Ljava/lang/Integer;Ln7/f;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p6}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final getById-m7AL99Q(Ljava/util/Set;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, p2, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;-><init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getContentResolver()Landroid/content/ContentResolver;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/ContactRepository;->contentResolver:Landroid/content/ContentResolver;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCount(Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getCount$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getCount$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getFieldFromContacts-m7AL99Q(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lexpo/modules/contacts/next/domain/model/Extractable;",
            ">(",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromContacts$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getFieldFromData-m7AL99Q(Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lexpo/modules/contacts/next/domain/model/Extractable$Data;",
            ">(",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromData$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getFieldFromData$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getLookupKey-D2TBaGg(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$getLookupKey$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$getLookupKey$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final getRawContactId-K3SHF88(Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v2, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$2;

    .line 59
    .line 60
    invoke-direct {v2, p0, p1, v3}, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$2;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V

    .line 61
    .line 62
    .line 63
    iput v4, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getRawContactId$1;->label:I

    .line 64
    .line 65
    invoke-static {p2, v2, v0}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/RawContactId;

    .line 73
    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/RawContactId;->unbox-impl()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_4
    return-object v3
.end method

.method public final insert-Hoartsk(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/contact/NewContact;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance v2, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, p1, p0, v4}, Lexpo/modules/contacts/next/domain/ContactRepository$insert$2;-><init>(Lexpo/modules/contacts/next/domain/model/contact/NewContact;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 61
    .line 62
    .line 63
    iput v3, v0, Lexpo/modules/contacts/next/domain/ContactRepository$insert$1;->label:I

    .line 64
    .line 65
    invoke-static {p2, v2, v0}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 73
    .line 74
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->unbox-impl()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1
.end method

.method public final patch(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {}, LR8/d0;->b()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$patch$2;-><init>(Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final update(Lexpo/modules/contacts/next/domain/model/Updatable;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/Updatable;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 19
    invoke-static {}, LR8/d0;->b()LR8/J;

    move-result-object v0

    new-instance v1, Lexpo/modules/contacts/next/domain/ContactRepository$update$3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lexpo/modules/contacts/next/domain/ContactRepository$update$3;-><init>(Lexpo/modules/contacts/next/domain/model/Updatable;Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final update(Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;Ln7/f;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;

    iget v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;

    invoke-direct {v0, p0, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;-><init>(Lexpo/modules/contacts/next/domain/ContactRepository;Ln7/f;)V

    :goto_0
    iget-object p2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;->result:Ljava/lang/Object;

    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 2
    sget-object p2, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {p2}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object p2

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 4
    const-string v4, "raw_contact_id = ?"

    invoke-virtual {p2, v4, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object p2

    const-string v2, "build(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lj7/q;->c()Ljava/util/List;

    move-result-object v2

    .line 7
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->getToAppend()Ljava/util/List;

    move-result-object p2

    .line 9
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p2, v5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 11
    check-cast v5, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 12
    invoke-interface {v5}, Lexpo/modules/contacts/next/domain/model/Appendable;->toAppendOperation()Landroid/content/ContentProviderOperation;

    move-result-object v5

    .line 13
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :cond_3
    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 15
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->getStarred()Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    move-result-object p1

    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;->toUpdateOperation()Landroid/content/ContentProviderOperation;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-static {v2}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 17
    iget-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository;->contentResolver:Landroid/content/ContentResolver;

    iput v3, v0, Lexpo/modules/contacts/next/domain/ContactRepository$update$1;->label:I

    const-string v2, "com.android.contacts"

    invoke-static {p2, v2, p1, v0}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeApplyBatch(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/util/List;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 18
    :cond_4
    :goto_2
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
