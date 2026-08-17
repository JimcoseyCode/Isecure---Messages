.class public final Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/contacts/next/domain/model/ExtractableField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;",
        "",
        "<init>",
        "()V",
        "getAll",
        "",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField;",
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


# static fields
.field static final synthetic $$INSTANCE:Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;->$$INSTANCE:Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getAll()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    new-array v0, v0, [Lexpo/modules/contacts/next/domain/model/ExtractableField;

    .line 4
    .line 5
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/DisplayNameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/DisplayNameField;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    sget-object v1, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameField;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    sget-object v1, Lexpo/modules/contacts/next/domain/model/organization/OrganizationField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/organization/OrganizationField;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    aput-object v1, v0, v2

    .line 24
    .line 25
    sget-object v1, Lexpo/modules/contacts/next/domain/model/note/NoteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/note/NoteField;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    aput-object v1, v0, v2

    .line 29
    .line 30
    sget-object v1, Lexpo/modules/contacts/next/domain/model/photo/PhotoField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/photo/PhotoField;

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUriField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUriField;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    aput-object v1, v0, v2

    .line 39
    .line 40
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/PhotoUriField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/PhotoUriField;

    .line 41
    .line 42
    const/4 v2, 0x7

    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    sget-object v1, Lexpo/modules/contacts/next/domain/model/email/EmailField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/email/EmailField;

    .line 46
    .line 47
    const/16 v2, 0x8

    .line 48
    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    sget-object v1, Lexpo/modules/contacts/next/domain/model/phone/PhoneField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneField;

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    aput-object v1, v0, v2

    .line 56
    .line 57
    sget-object v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    .line 58
    .line 59
    const/16 v2, 0xa

    .line 60
    .line 61
    aput-object v1, v0, v2

    .line 62
    .line 63
    sget-object v1, Lexpo/modules/contacts/next/domain/model/event/EventField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/event/EventField;

    .line 64
    .line 65
    const/16 v2, 0xb

    .line 66
    .line 67
    aput-object v1, v0, v2

    .line 68
    .line 69
    sget-object v1, Lexpo/modules/contacts/next/domain/model/relationship/RelationField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationField;

    .line 70
    .line 71
    const/16 v2, 0xc

    .line 72
    .line 73
    aput-object v1, v0, v2

    .line 74
    .line 75
    sget-object v1, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    .line 76
    .line 77
    const/16 v2, 0xd

    .line 78
    .line 79
    aput-object v1, v0, v2

    .line 80
    .line 81
    sget-object v1, Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;

    .line 82
    .line 83
    const/16 v2, 0xe

    .line 84
    .line 85
    aput-object v1, v0, v2

    .line 86
    .line 87
    invoke-static {v0}, Lj7/T;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method
