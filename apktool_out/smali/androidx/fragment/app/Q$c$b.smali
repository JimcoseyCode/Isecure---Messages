.class public final enum Landroidx/fragment/app/Q$c$b;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Q$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/Q$c$b$a;,
        Landroidx/fragment/app/Q$c$b$b;
    }
.end annotation


# static fields
.field public static final g:Landroidx/fragment/app/Q$c$b$a;

.field public static final enum h:Landroidx/fragment/app/Q$c$b;

.field public static final enum i:Landroidx/fragment/app/Q$c$b;

.field public static final enum j:Landroidx/fragment/app/Q$c$b;

.field public static final enum k:Landroidx/fragment/app/Q$c$b;

.field private static final synthetic l:[Landroidx/fragment/app/Q$c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/fragment/app/Q$c$b;

    .line 2
    .line 3
    const-string v1, "REMOVED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/Q$c$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/fragment/app/Q$c$b;->h:Landroidx/fragment/app/Q$c$b;

    .line 10
    .line 11
    new-instance v0, Landroidx/fragment/app/Q$c$b;

    .line 12
    .line 13
    const-string v1, "VISIBLE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/Q$c$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/fragment/app/Q$c$b;->i:Landroidx/fragment/app/Q$c$b;

    .line 20
    .line 21
    new-instance v0, Landroidx/fragment/app/Q$c$b;

    .line 22
    .line 23
    const-string v1, "GONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/Q$c$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/fragment/app/Q$c$b;->j:Landroidx/fragment/app/Q$c$b;

    .line 30
    .line 31
    new-instance v0, Landroidx/fragment/app/Q$c$b;

    .line 32
    .line 33
    const-string v1, "INVISIBLE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/Q$c$b;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Landroidx/fragment/app/Q$c$b;->k:Landroidx/fragment/app/Q$c$b;

    .line 40
    .line 41
    invoke-static {}, Landroidx/fragment/app/Q$c$b;->h()[Landroidx/fragment/app/Q$c$b;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Landroidx/fragment/app/Q$c$b;->l:[Landroidx/fragment/app/Q$c$b;

    .line 46
    .line 47
    new-instance v0, Landroidx/fragment/app/Q$c$b$a;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {v0, v1}, Landroidx/fragment/app/Q$c$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Landroidx/fragment/app/Q$c$b;->g:Landroidx/fragment/app/Q$c$b$a;

    .line 54
    .line 55
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic h()[Landroidx/fragment/app/Q$c$b;
    .locals 4

    .line 1
    sget-object v0, Landroidx/fragment/app/Q$c$b;->h:Landroidx/fragment/app/Q$c$b;

    .line 2
    .line 3
    sget-object v1, Landroidx/fragment/app/Q$c$b;->i:Landroidx/fragment/app/Q$c$b;

    .line 4
    .line 5
    sget-object v2, Landroidx/fragment/app/Q$c$b;->j:Landroidx/fragment/app/Q$c$b;

    .line 6
    .line 7
    sget-object v3, Landroidx/fragment/app/Q$c$b;->k:Landroidx/fragment/app/Q$c$b;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Landroidx/fragment/app/Q$c$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static final k(I)Landroidx/fragment/app/Q$c$b;
    .locals 1

    .line 1
    sget-object v0, Landroidx/fragment/app/Q$c$b;->g:Landroidx/fragment/app/Q$c$b$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Q$c$b$a;->b(I)Landroidx/fragment/app/Q$c$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/fragment/app/Q$c$b;
    .locals 1

    .line 1
    const-class v0, Landroidx/fragment/app/Q$c$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/fragment/app/Q$c$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroidx/fragment/app/Q$c$b;
    .locals 1

    .line 1
    sget-object v0, Landroidx/fragment/app/Q$c$b;->l:[Landroidx/fragment/app/Q$c$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroidx/fragment/app/Q$c$b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/fragment/app/Q$c$b$b;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v1, :cond_6

    .line 17
    .line 18
    if-eq v0, v2, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_3
    const/16 v0, 0x8

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    :cond_5
    const/4 v0, 0x0

    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 74
    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    check-cast v0, Landroid/view/ViewGroup;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    const/4 v0, 0x0

    .line 81
    :goto_0
    if-eqz v0, :cond_9

    .line 82
    .line 83
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    :cond_8
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    :cond_9
    :goto_1
    return-void
.end method
