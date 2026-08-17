.class public final Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J!\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;",
        "",
        "imageByteArrayConverter",
        "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;",
        "<init>",
        "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V",
        "getImageByteArrayConverter",
        "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;",
        "toDto",
        "model",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "dataId",
        "Lexpo/modules/contacts/next/domain/wrappers/DataId;",
        "newValue",
        "toUpdatable-bM46d30",
        "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;",
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
.field private final imageByteArrayConverter:Lexpo/modules/contacts/next/services/ImageByteArrayConverter;


# direct methods
.method public constructor <init>(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V
    .locals 1

    .line 1
    const-string v0, "imageByteArrayConverter"

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
    iput-object p1, p0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->imageByteArrayConverter:Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getImageByteArrayConverter()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->imageByteArrayConverter:Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic toAppendable-MYK5hZQ(Ljava/lang/Object;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->toAppendable-MYK5hZQ(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 2

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->imageByteArrayConverter:Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 4
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/services/ImageByteArrayConverter;->toByteArray(Landroid/net/Uri;)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 5
    :goto_0
    new-instance v1, Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;

    invoke-direct {v1, p2, p1, v0}, Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;-><init>(Ljava/lang/String;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->toDto(Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;)Ljava/lang/String;
    .locals 2

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;->getPhoto()[B

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, LP8/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 2

    const-string v0, "dataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 2
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;->imageByteArrayConverter:Lexpo/modules/contacts/next/services/ImageByteArrayConverter;

    .line 3
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 4
    invoke-virtual {v1, p2}, Lexpo/modules/contacts/next/services/ImageByteArrayConverter;->toByteArray(Landroid/net/Uri;)[B

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    .line 5
    :goto_0
    new-instance v1, Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;

    invoke-direct {v1, p1, p2, v0}, Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;-><init>(Ljava/lang/String;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
