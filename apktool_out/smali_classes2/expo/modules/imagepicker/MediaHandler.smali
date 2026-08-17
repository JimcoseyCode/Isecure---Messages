.class public final Lexpo/modules/imagepicker/MediaHandler;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/imagepicker/MediaHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J8\u0010\u001b\u001a\u00020\u00182\u001e\u0010\u0017\u001a\u001a\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u00140\u0013j\u0002`\u00162\u0006\u0010\t\u001a\u00020\u0008H\u0080@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lexpo/modules/imagepicker/MediaHandler;",
        "",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "appContextProvider",
        "<init>",
        "(Lexpo/modules/kotlin/providers/AppContextProvider;)V",
        "Landroid/net/Uri;",
        "sourceUri",
        "Lexpo/modules/imagepicker/ImagePickerOptions;",
        "options",
        "Lexpo/modules/imagepicker/ImagePickerAsset;",
        "handleImage",
        "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;",
        "uri",
        "Lexpo/modules/imagepicker/AdditionalFileData;",
        "getAdditionalFileData",
        "(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;",
        "handleVideo",
        "(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;",
        "",
        "Lkotlin/Pair;",
        "Lexpo/modules/imagepicker/MediaType;",
        "Lexpo/modules/imagepicker/contracts/MediaList;",
        "bareResult",
        "Lexpo/modules/imagepicker/ImagePickerResponse;",
        "readExtras$expo_image_picker_release",
        "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;",
        "readExtras",
        "Lexpo/modules/kotlin/providers/AppContextProvider;",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "context",
        "Ljava/io/File;",
        "getCacheDirectory",
        "()Ljava/io/File;",
        "cacheDirectory",
        "expo-image-picker_release"
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
.field private final appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/providers/AppContextProvider;)V
    .locals 1

    .line 1
    const-string v0, "appContextProvider"

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
    iput-object p1, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic access$handleImage(Lexpo/modules/imagepicker/MediaHandler;Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/imagepicker/MediaHandler;->handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$handleVideo(Lexpo/modules/imagepicker/MediaHandler;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/imagepicker/MediaHandler;->handleVideo(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;
    .locals 9

    .line 1
    const-string v0, "_display_name"

    .line 2
    .line 3
    const-string v1, "_size"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    new-array v3, v3, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v5, v2

    .line 21
    check-cast v5, [Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {p0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v4, p1

    .line 35
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz p1, :cond_6

    .line 41
    .line 42
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 43
    .line 44
    .line 45
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-static {p1, v2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_0
    :try_start_1
    sget-object v3, Li7/o;->h:Li7/o$a;

    .line 53
    .line 54
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, -0x1

    .line 67
    if-eq v3, v4, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v0, v2

    .line 71
    :goto_0
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_4

    .line 84
    :cond_2
    move-object v0, v2

    .line 85
    :goto_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    move-object v1, v2

    .line 101
    :goto_2
    if-eqz v1, :cond_4

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    move-object v1, v2

    .line 117
    :goto_3
    new-instance v3, Lexpo/modules/imagepicker/AdditionalFileData;

    .line 118
    .line 119
    invoke-direct {v3, v0, v1}, Lexpo/modules/imagepicker/AdditionalFileData;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    goto :goto_5

    .line 127
    :goto_4
    :try_start_2
    sget-object v1, Li7/o;->h:Li7/o$a;

    .line 128
    .line 129
    invoke-static {v0}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_5
    invoke-static {v0}, Li7/o;->f(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_5

    .line 142
    .line 143
    move-object v0, v2

    .line 144
    :cond_5
    check-cast v0, Lexpo/modules/imagepicker/AdditionalFileData;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 145
    .line 146
    invoke-static {p1, v2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :catchall_1
    move-exception v0

    .line 151
    move-object v1, v0

    .line 152
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 153
    :catchall_2
    move-exception v0

    .line 154
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_6
    return-object v2
.end method

.method private final getCacheDirectory()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getCacheDirectory()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/kotlin/providers/AppContextProvider;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "React Application Context is null"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method private final handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lexpo/modules/imagepicker/ImagePickerOptions;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    .line 13
    .line 14
    iget v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Ln7/f;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    const/4 v7, 0x1

    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x0

    .line 43
    const-string v10, "getContentResolver(...)"

    .line 44
    .line 45
    if-eqz v5, :cond_4

    .line 46
    .line 47
    if-eq v5, v7, :cond_3

    .line 48
    .line 49
    if-eq v5, v8, :cond_2

    .line 50
    .line 51
    if-ne v5, v6, :cond_1

    .line 52
    .line 53
    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    .line 60
    .line 61
    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v5, Ljava/io/File;

    .line 64
    .line 65
    iget-object v6, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Landroid/net/Uri;

    .line 72
    .line 73
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_2
    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    .line 89
    .line 90
    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Ljava/io/File;

    .line 93
    .line 94
    iget-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v11, Lexpo/modules/imagepicker/ImagePickerOptions;

    .line 101
    .line 102
    iget-object v12, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v12, Landroid/net/Uri;

    .line 105
    .line 106
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_3
    iget-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Ljava/io/File;

    .line 114
    .line 115
    iget-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v7, Lexpo/modules/imagepicker/ImagePickerOptions;

    .line 122
    .line 123
    iget-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v11, Landroid/net/Uri;

    .line 126
    .line 127
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v13, v7

    .line 131
    move-object v7, v5

    .line 132
    move-object v5, v1

    .line 133
    move-object v1, v11

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {p2 .. p2}, Lexpo/modules/imagepicker/ImagePickerOptions;->getQuality()D

    .line 139
    .line 140
    .line 141
    move-result-wide v11

    .line 142
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 143
    .line 144
    cmpg-double v2, v11, v13

    .line 145
    .line 146
    if-nez v2, :cond_5

    .line 147
    .line 148
    new-instance v2, Lexpo/modules/imagepicker/exporters/RawImageExporter;

    .line 149
    .line 150
    invoke-direct {v2}, Lexpo/modules/imagepicker/exporters/RawImageExporter;-><init>()V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    new-instance v2, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    .line 155
    .line 156
    iget-object v5, v0, Lexpo/modules/imagepicker/MediaHandler;->appContextProvider:Lexpo/modules/kotlin/providers/AppContextProvider;

    .line 157
    .line 158
    invoke-virtual/range {p2 .. p2}, Lexpo/modules/imagepicker/ImagePickerOptions;->getQuality()D

    .line 159
    .line 160
    .line 161
    move-result-wide v11

    .line 162
    invoke-direct {v2, v5, v11, v12}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;-><init>(Lexpo/modules/kotlin/providers/AppContextProvider;D)V

    .line 163
    .line 164
    .line 165
    :goto_1
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v5, v1}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    if-eqz v5, :cond_11

    .line 181
    .line 182
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getCacheDirectory()Ljava/io/File;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-static {v5}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->toImageFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-static {v11, v12}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->createOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 206
    .line 207
    move-object/from16 v13, p2

    .line 208
    .line 209
    iput-object v13, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v11, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 214
    .line 215
    iput v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 216
    .line 217
    invoke-interface {v2, v1, v11, v12, v3}, Lexpo/modules/imagepicker/exporters/ImageExporter;->exportAsync(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-ne v2, v4, :cond_6

    .line 222
    .line 223
    goto/16 :goto_7

    .line 224
    .line 225
    :cond_6
    move-object v7, v5

    .line 226
    move-object v5, v11

    .line 227
    :goto_2
    check-cast v2, Lexpo/modules/imagepicker/exporters/ImageExportResult;

    .line 228
    .line 229
    invoke-virtual {v13}, Lexpo/modules/imagepicker/ImagePickerOptions;->getBase64()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    if-eqz v12, :cond_7

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_7
    move-object v11, v9

    .line 245
    :goto_3
    if-eqz v11, :cond_a

    .line 246
    .line 247
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    invoke-virtual {v11}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-static {v11, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v13, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    .line 267
    .line 268
    iput v8, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 269
    .line 270
    invoke-virtual {v2, v11, v3}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->data(Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    if-ne v11, v4, :cond_8

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_8
    move-object v12, v1

    .line 278
    move-object v1, v2

    .line 279
    move-object v2, v11

    .line 280
    move-object v11, v13

    .line 281
    :goto_4
    check-cast v2, Ljava/io/ByteArrayOutputStream;

    .line 282
    .line 283
    if-eqz v2, :cond_9

    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-static {v2, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    move-object/from16 v25, v2

    .line 294
    .line 295
    move-object v2, v1

    .line 296
    move-object/from16 v1, v25

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_9
    move-object v2, v1

    .line 300
    move-object v13, v11

    .line 301
    move-object v1, v12

    .line 302
    :cond_a
    move-object v12, v1

    .line 303
    move-object v1, v9

    .line 304
    move-object v11, v13

    .line 305
    :goto_5
    invoke-virtual {v11}, Lexpo/modules/imagepicker/ImagePickerOptions;->getExif()Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-eqz v11, :cond_b

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_b
    move-object v8, v9

    .line 321
    :goto_6
    if-eqz v8, :cond_d

    .line 322
    .line 323
    invoke-direct {v0}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    invoke-static {v8, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    iput-object v12, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$0:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$1:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$2:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$3:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v1, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->L$4:Ljava/lang/Object;

    .line 343
    .line 344
    iput v6, v3, Lexpo/modules/imagepicker/MediaHandler$handleImage$1;->label:I

    .line 345
    .line 346
    invoke-virtual {v2, v8, v3}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->exif(Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    if-ne v3, v4, :cond_c

    .line 351
    .line 352
    :goto_7
    return-object v4

    .line 353
    :cond_c
    move-object v4, v2

    .line 354
    move-object v2, v3

    .line 355
    move-object v6, v7

    .line 356
    move-object v3, v12

    .line 357
    :goto_8
    move-object v9, v2

    .line 358
    check-cast v9, Landroid/os/Bundle;

    .line 359
    .line 360
    move-object v12, v3

    .line 361
    move-object v2, v4

    .line 362
    move-object/from16 v18, v6

    .line 363
    .line 364
    :goto_9
    move-object/from16 v19, v1

    .line 365
    .line 366
    move-object/from16 v20, v9

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_d
    move-object/from16 v18, v7

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :goto_a
    invoke-direct {v0, v12}, Lexpo/modules/imagepicker/MediaHandler;->getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    move-object v3, v12

    .line 377
    sget-object v12, Lexpo/modules/imagepicker/MediaType;->IMAGE:Lexpo/modules/imagepicker/MediaType;

    .line 378
    .line 379
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v13

    .line 387
    const-string v4, "toString(...)"

    .line 388
    .line 389
    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->getWidth()I

    .line 393
    .line 394
    .line 395
    move-result v14

    .line 396
    invoke-virtual {v2}, Lexpo/modules/imagepicker/exporters/ImageExportResult;->getHeight()I

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    if-eqz v1, :cond_f

    .line 401
    .line 402
    invoke-virtual {v1}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    if-nez v2, :cond_e

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :cond_e
    :goto_b
    move-object/from16 v16, v2

    .line 410
    .line 411
    goto :goto_d

    .line 412
    :cond_f
    :goto_c
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    goto :goto_b

    .line 417
    :goto_d
    if-eqz v1, :cond_10

    .line 418
    .line 419
    invoke-virtual {v1}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileSize()Ljava/lang/Long;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-eqz v1, :cond_10

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    goto :goto_e

    .line 430
    :cond_10
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 431
    .line 432
    .line 433
    move-result-wide v1

    .line 434
    :goto_e
    invoke-static {v3}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getMediaStoreAssetId(Landroid/net/Uri;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    new-instance v10, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 439
    .line 440
    invoke-static {v1, v2}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    .line 441
    .line 442
    .line 443
    move-result-object v17

    .line 444
    const/16 v23, 0xc00

    .line 445
    .line 446
    const/16 v24, 0x0

    .line 447
    .line 448
    const/16 v21, 0x0

    .line 449
    .line 450
    const/16 v22, 0x0

    .line 451
    .line 452
    invoke-direct/range {v10 .. v24}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 453
    .line 454
    .line 455
    return-object v10

    .line 456
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 457
    .line 458
    const-string v2, "Required value was null."

    .line 459
    .line 460
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    throw v1
.end method

.method private final handleVideo(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    .line 13
    .line 14
    iget v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Ln7/f;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    .line 38
    .line 39
    const-string v6, "getContentResolver(...)"

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    if-ne v5, v7, :cond_1

    .line 45
    .line 46
    iget-object v0, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/io/File;

    .line 49
    .line 50
    iget-object v3, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Landroid/net/Uri;

    .line 53
    .line 54
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object v2, v0

    .line 58
    move-object v0, v3

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    invoke-static {v2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getCacheDirectory()Ljava/io/File;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v5, ".mp4"

    .line 76
    .line 77
    invoke-static {v2, v5}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->createOutputFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v2, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput v7, v3, Lexpo/modules/imagepicker/MediaHandler$handleVideo$1;->label:I

    .line 97
    .line 98
    invoke-static {v0, v2, v5, v3}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->copyFile(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-ne v3, v4, :cond_3

    .line 103
    .line 104
    return-object v4

    .line 105
    :cond_3
    :goto_1
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :try_start_0
    new-instance v4, Landroid/media/MediaMetadataRetriever;

    .line 110
    .line 111
    invoke-direct {v4}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v4, v5, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v1, v0}, Lexpo/modules/imagepicker/MediaHandler;->getAdditionalFileData(Landroid/net/Uri;)Lexpo/modules/imagepicker/AdditionalFileData;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-direct {v1}, Lexpo/modules/imagepicker/MediaHandler;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-static {v7, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v7, v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getType(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v16

    .line 140
    new-instance v6, Lkotlin/jvm/internal/A;

    .line 141
    .line 142
    invoke-direct {v6}, Lkotlin/jvm/internal/A;-><init>()V

    .line 143
    .line 144
    .line 145
    const/16 v7, 0x12

    .line 146
    .line 147
    invoke-static {v4, v7}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    iput v7, v6, Lkotlin/jvm/internal/A;->g:I

    .line 152
    .line 153
    new-instance v7, Lkotlin/jvm/internal/A;

    .line 154
    .line 155
    invoke-direct {v7}, Lkotlin/jvm/internal/A;-><init>()V

    .line 156
    .line 157
    .line 158
    const/16 v8, 0x13

    .line 159
    .line 160
    invoke-static {v4, v8}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    iput v8, v7, Lkotlin/jvm/internal/A;->g:I

    .line 165
    .line 166
    const/16 v8, 0x18

    .line 167
    .line 168
    invoke-static {v4, v8}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    rem-int/lit16 v9, v8, 0xb4

    .line 173
    .line 174
    if-eqz v9, :cond_4

    .line 175
    .line 176
    iget v9, v7, Lkotlin/jvm/internal/A;->g:I

    .line 177
    .line 178
    iget v10, v6, Lkotlin/jvm/internal/A;->g:I

    .line 179
    .line 180
    iput v10, v7, Lkotlin/jvm/internal/A;->g:I

    .line 181
    .line 182
    iput v9, v6, Lkotlin/jvm/internal/A;->g:I

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catch_0
    move-exception v0

    .line 186
    goto :goto_4

    .line 187
    :cond_4
    :goto_2
    sget-object v10, Lexpo/modules/imagepicker/MediaType;->VIDEO:Lexpo/modules/imagepicker/MediaType;

    .line 188
    .line 189
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    const-string v3, "toString(...)"

    .line 194
    .line 195
    invoke-static {v11, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget v12, v6, Lkotlin/jvm/internal/A;->g:I

    .line 199
    .line 200
    iget v13, v7, Lkotlin/jvm/internal/A;->g:I

    .line 201
    .line 202
    const/4 v3, 0x0

    .line 203
    if-eqz v5, :cond_5

    .line 204
    .line 205
    invoke-virtual {v5}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    move-object v14, v6

    .line 210
    goto :goto_3

    .line 211
    :cond_5
    move-object v14, v3

    .line 212
    :goto_3
    if-eqz v5, :cond_6

    .line 213
    .line 214
    invoke-virtual {v5}, Lexpo/modules/imagepicker/AdditionalFileData;->getFileSize()Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    :cond_6
    move-object v15, v3

    .line 219
    const/16 v3, 0x9

    .line 220
    .line 221
    invoke-static {v4, v3}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->extractInt(Landroid/media/MediaMetadataRetriever;I)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    invoke-static {v0}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->getMediaStoreAssetId(Landroid/net/Uri;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    move v0, v8

    .line 230
    new-instance v8, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 231
    .line 232
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v19

    .line 236
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v20

    .line 240
    const/16 v21, 0x300

    .line 241
    .line 242
    const/16 v22, 0x0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    invoke-direct/range {v8 .. v22}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catch Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    .line 250
    .line 251
    return-object v8

    .line 252
    :goto_4
    new-instance v3, Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException;

    .line 253
    .line 254
    invoke-direct {v3, v2, v0}, Lexpo/modules/imagepicker/FailedToExtractVideoMetadataException;-><init>(Ljava/io/File;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw v3
.end method


# virtual methods
.method public final readExtras$expo_image_picker_release(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlin/Pair<",
            "+",
            "Lexpo/modules/imagepicker/MediaType;",
            "+",
            "Landroid/net/Uri;",
            ">;>;",
            "Lexpo/modules/imagepicker/ImagePickerOptions;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    .line 11
    .line 12
    iget v3, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;-><init>(Lexpo/modules/imagepicker/MediaHandler;Ln7/f;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Ljava/util/Collection;

    .line 48
    .line 49
    iget-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v7, Ljava/util/Iterator;

    .line 52
    .line 53
    iget-object v8, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Ljava/util/Collection;

    .line 56
    .line 57
    iget-object v9, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Lexpo/modules/imagepicker/ImagePickerOptions;

    .line 60
    .line 61
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_2
    iget-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ljava/util/Collection;

    .line 77
    .line 78
    iget-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v7, Ljava/util/Iterator;

    .line 81
    .line 82
    iget-object v8, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Ljava/util/Collection;

    .line 85
    .line 86
    iget-object v9, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, Lexpo/modules/imagepicker/ImagePickerOptions;

    .line 89
    .line 90
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_3
    invoke-static {v1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    const/16 v4, 0xa

    .line 101
    .line 102
    move-object/from16 v7, p1

    .line 103
    .line 104
    invoke-static {v7, v4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    move-object v7, v4

    .line 116
    move-object v4, v1

    .line 117
    move-object/from16 v1, p2

    .line 118
    .line 119
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_a

    .line 124
    .line 125
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Lkotlin/Pair;

    .line 130
    .line 131
    invoke-virtual {v8}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    check-cast v9, Lexpo/modules/imagepicker/MediaType;

    .line 136
    .line 137
    invoke-virtual {v8}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    check-cast v8, Landroid/net/Uri;

    .line 142
    .line 143
    const/4 v10, -0x1

    .line 144
    if-nez v9, :cond_4

    .line 145
    .line 146
    move v9, v10

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    sget-object v11, Lexpo/modules/imagepicker/MediaHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 149
    .line 150
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    aget v9, v11, v9

    .line 155
    .line 156
    :goto_2
    if-eq v9, v10, :cond_9

    .line 157
    .line 158
    if-eq v9, v6, :cond_7

    .line 159
    .line 160
    if-ne v9, v5, :cond_6

    .line 161
    .line 162
    iput-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    .line 169
    .line 170
    iput v5, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    .line 171
    .line 172
    invoke-direct {v0, v8, v1, v2}, Lexpo/modules/imagepicker/MediaHandler;->handleImage(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Ln7/f;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    if-ne v8, v3, :cond_5

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    move-object v9, v1

    .line 180
    move-object v1, v8

    .line 181
    move-object v8, v4

    .line 182
    :goto_3
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_6
    new-instance v1, Li7/m;

    .line 186
    .line 187
    invoke-direct {v1}, Li7/m;-><init>()V

    .line 188
    .line 189
    .line 190
    throw v1

    .line 191
    :cond_7
    iput-object v1, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$0:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$1:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v7, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$2:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v4, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->L$3:Ljava/lang/Object;

    .line 198
    .line 199
    iput v6, v2, Lexpo/modules/imagepicker/MediaHandler$readExtras$1;->label:I

    .line 200
    .line 201
    invoke-direct {v0, v8, v2}, Lexpo/modules/imagepicker/MediaHandler;->handleVideo(Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    if-ne v8, v3, :cond_8

    .line 206
    .line 207
    :goto_4
    return-object v3

    .line 208
    :cond_8
    move-object v9, v1

    .line 209
    move-object v1, v8

    .line 210
    move-object v8, v4

    .line 211
    :goto_5
    check-cast v1, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_9
    new-instance v10, Lexpo/modules/imagepicker/ImagePickerAsset;

    .line 215
    .line 216
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    const-string v8, "toString(...)"

    .line 221
    .line 222
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/16 v23, 0xff9

    .line 226
    .line 227
    const/16 v24, 0x0

    .line 228
    .line 229
    const/4 v11, 0x0

    .line 230
    const/4 v12, 0x0

    .line 231
    const/4 v14, 0x0

    .line 232
    const/4 v15, 0x0

    .line 233
    const/16 v16, 0x0

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    const/16 v19, 0x0

    .line 240
    .line 241
    const/16 v20, 0x0

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    invoke-direct/range {v10 .. v24}, Lexpo/modules/imagepicker/ImagePickerAsset;-><init>(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    move-object v9, v1

    .line 251
    move-object v8, v4

    .line 252
    move-object v1, v10

    .line 253
    :goto_6
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-object v4, v8

    .line 257
    move-object v1, v9

    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :cond_a
    check-cast v4, Ljava/util/List;

    .line 261
    .line 262
    new-instance v1, Lexpo/modules/imagepicker/ImagePickerResponse;

    .line 263
    .line 264
    const/4 v2, 0x0

    .line 265
    invoke-direct {v1, v2, v4}, Lexpo/modules/imagepicker/ImagePickerResponse;-><init>(ZLjava/util/List;)V

    .line 266
    .line 267
    .line 268
    return-object v1
.end method
