.class public final Lexpo/modules/medialibrary/next/records/SortDescriptor;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/medialibrary/next/records/SortDescriptor;",
        "Lexpo/modules/kotlin/records/Record;",
        "key",
        "Lexpo/modules/medialibrary/next/records/AssetField;",
        "ascending",
        "",
        "<init>",
        "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)V",
        "getKey$annotations",
        "()V",
        "getKey",
        "()Lexpo/modules/medialibrary/next/records/AssetField;",
        "getAscending$annotations",
        "getAscending",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "toMediaStoreQueryString",
        "",
        "component1",
        "component2",
        "copy",
        "(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)Lexpo/modules/medialibrary/next/records/SortDescriptor;",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "expo-media-library_release"
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
.field private final ascending:Ljava/lang/Boolean;

.field private final key:Lexpo/modules/medialibrary/next/records/AssetField;


# direct methods
.method public constructor <init>(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/medialibrary/next/records/SortDescriptor;-><init>(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/medialibrary/next/records/SortDescriptor;Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;ILjava/lang/Object;)Lexpo/modules/medialibrary/next/records/SortDescriptor;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/records/SortDescriptor;->copy(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)Lexpo/modules/medialibrary/next/records/SortDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static synthetic getAscending$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getKey$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final component1()Lexpo/modules/medialibrary/next/records/AssetField;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)Lexpo/modules/medialibrary/next/records/SortDescriptor;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/medialibrary/next/records/SortDescriptor;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Lexpo/modules/medialibrary/next/records/SortDescriptor;-><init>(Lexpo/modules/medialibrary/next/records/AssetField;Ljava/lang/Boolean;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/medialibrary/next/records/SortDescriptor;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/medialibrary/next/records/SortDescriptor;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object p1, p1, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v0
.end method

.method public final getAscending()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKey()Lexpo/modules/medialibrary/next/records/AssetField;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public final toMediaStoreQueryString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "ASC"

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const-string v0, "DESC"

    .line 17
    .line 18
    :goto_1
    iget-object v1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 19
    .line 20
    invoke-virtual {v1}, Lexpo/modules/medialibrary/next/records/AssetField;->toMediaStoreColumn()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " "

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->key:Lexpo/modules/medialibrary/next/records/AssetField;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/records/SortDescriptor;->ascending:Ljava/lang/Boolean;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "SortDescriptor(key="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", ascending="

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
