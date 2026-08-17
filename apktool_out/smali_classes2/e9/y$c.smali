.class public final Le9/y$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/y$c$a;
    }
.end annotation


# static fields
.field public static final c:Le9/y$c$a;


# instance fields
.field private final a:Le9/t;

.field private final b:Le9/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le9/y$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le9/y$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/y$c;->c:Le9/y$c$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Le9/t;Le9/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/y$c;->a:Le9/t;

    iput-object p2, p0, Le9/y$c;->b:Le9/C;

    return-void
.end method

.method public synthetic constructor <init>(Le9/t;Le9/C;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Le9/y$c;-><init>(Le9/t;Le9/C;)V

    return-void
.end method


# virtual methods
.method public final a()Le9/C;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/y$c;->b:Le9/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Le9/t;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/y$c;->a:Le9/t;

    .line 2
    .line 3
    return-object v0
.end method
