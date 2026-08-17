.class public final Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;",
        "",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "starred",
        "Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;",
        "toAppend",
        "",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getRawContactId-WW_a-ig",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getStarred",
        "()Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;",
        "getToAppend",
        "()Ljava/util/List;",
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
.field private final rawContactId:Ljava/lang/String;

.field private final starred:Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

.field private final toAppend:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;",
            "Ljava/util/List<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rawContactId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "starred"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toAppend"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->rawContactId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->starred:Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->toAppend:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getRawContactId-WW_a-ig()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->rawContactId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStarred()Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->starred:Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getToAppend()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/Appendable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;->toAppend:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
