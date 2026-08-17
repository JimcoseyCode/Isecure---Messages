.class public final enum Lexpo/modules/image/enums/ContentFit;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/enums/ContentFit$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/image/enums/ContentFit;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\u0008\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/image/enums/ContentFit;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "Contain",
        "Cover",
        "Fill",
        "None",
        "ScaleDown",
        "toMatrix",
        "Landroid/graphics/Matrix;",
        "imageRect",
        "Landroid/graphics/RectF;",
        "viewRect",
        "sourceWidth",
        "",
        "sourceHeight",
        "toMatrix$expo_image_release",
        "expo-image_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/image/enums/ContentFit;

.field public static final enum Contain:Lexpo/modules/image/enums/ContentFit;

.field public static final enum Cover:Lexpo/modules/image/enums/ContentFit;

.field public static final enum Fill:Lexpo/modules/image/enums/ContentFit;

.field public static final enum None:Lexpo/modules/image/enums/ContentFit;

.field public static final enum ScaleDown:Lexpo/modules/image/enums/ContentFit;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/image/enums/ContentFit;
    .locals 5

    .line 1
    sget-object v0, Lexpo/modules/image/enums/ContentFit;->Contain:Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/image/enums/ContentFit;->Cover:Lexpo/modules/image/enums/ContentFit;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/image/enums/ContentFit;->Fill:Lexpo/modules/image/enums/ContentFit;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/image/enums/ContentFit;->None:Lexpo/modules/image/enums/ContentFit;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/image/enums/ContentFit;->ScaleDown:Lexpo/modules/image/enums/ContentFit;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lexpo/modules/image/enums/ContentFit;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "contain"

    .line 5
    .line 6
    const-string v3, "Contain"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/enums/ContentFit;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->Contain:Lexpo/modules/image/enums/ContentFit;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/image/enums/ContentFit;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "cover"

    .line 17
    .line 18
    const-string v3, "Cover"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/enums/ContentFit;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->Cover:Lexpo/modules/image/enums/ContentFit;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/image/enums/ContentFit;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "fill"

    .line 29
    .line 30
    const-string v3, "Fill"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/enums/ContentFit;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->Fill:Lexpo/modules/image/enums/ContentFit;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/image/enums/ContentFit;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "none"

    .line 41
    .line 42
    const-string v3, "None"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/enums/ContentFit;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->None:Lexpo/modules/image/enums/ContentFit;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/image/enums/ContentFit;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "scale-down"

    .line 53
    .line 54
    const-string v3, "ScaleDown"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/enums/ContentFit;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->ScaleDown:Lexpo/modules/image/enums/ContentFit;

    .line 60
    .line 61
    invoke-static {}, Lexpo/modules/image/enums/ContentFit;->$values()[Lexpo/modules/image/enums/ContentFit;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->$VALUES:[Lexpo/modules/image/enums/ContentFit;

    .line 66
    .line 67
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lexpo/modules/image/enums/ContentFit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 72
    .line 73
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/image/enums/ContentFit;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/image/enums/ContentFit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/image/enums/ContentFit;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/image/enums/ContentFit;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/image/enums/ContentFit;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/image/enums/ContentFit;->$VALUES:[Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/image/enums/ContentFit;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/enums/ContentFit;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toMatrix$expo_image_release(Landroid/graphics/RectF;Landroid/graphics/RectF;II)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    const-string v0, "imageRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lexpo/modules/image/enums/ContentFit$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aget v1, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_8

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    if-eq v1, v2, :cond_7

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq v1, v2, :cond_6

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    if-eq v1, v2, :cond_5

    .line 35
    .line 36
    const/4 v2, 0x5

    .line 37
    if-ne v1, v2, :cond_4

    .line 38
    .line 39
    const/4 v1, -0x1

    .line 40
    if-eq p3, v1, :cond_2

    .line 41
    .line 42
    if-eq p4, v1, :cond_2

    .line 43
    .line 44
    new-instance v1, Landroid/graphics/RectF;

    .line 45
    .line 46
    int-to-float p3, p3

    .line 47
    int-to-float p4, p4

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, v2, v2, p3, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    cmpl-float p3, p3, p4

    .line 61
    .line 62
    if-gez p3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    cmpl-float p3, p3, p4

    .line 73
    .line 74
    if-ltz p3, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    sget-object p2, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 78
    .line 79
    invoke-virtual {v0, p1, v1, p2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_1
    :goto_0
    sget-object p3, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 84
    .line 85
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    cmpl-float p3, p3, p4

    .line 98
    .line 99
    if-gez p3, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    cmpl-float p3, p3, p4

    .line 110
    .line 111
    if-ltz p3, :cond_5

    .line 112
    .line 113
    :cond_3
    sget-object p3, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_4
    new-instance p1, Li7/m;

    .line 120
    .line 121
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_5
    return-object v0

    .line 126
    :cond_6
    sget-object p3, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 127
    .line 128
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 141
    .line 142
    .line 143
    move-result p4

    .line 144
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    div-float/2addr p4, p3

    .line 149
    div-float/2addr p2, p1

    .line 150
    invoke-static {p4, p2}, Ljava/lang/Math;->max(FF)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-virtual {v0, p1, p1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 155
    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_8
    sget-object p3, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    .line 159
    .line 160
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 161
    .line 162
    .line 163
    return-object v0
.end method
