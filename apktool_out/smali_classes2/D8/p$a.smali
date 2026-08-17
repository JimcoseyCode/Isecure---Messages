.class public final LD8/p$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LD8/p$a;

.field private static final b:LD8/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LD8/p$a;

    .line 2
    .line 3
    invoke-direct {v0}, LD8/p$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD8/p$a;->a:LD8/p$a;

    .line 7
    .line 8
    new-instance v0, LD8/q;

    .line 9
    .line 10
    sget-object v1, LD8/g$a;->a:LD8/g$a;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    invoke-direct {v0, v1, v2, v3, v2}, LD8/q;-><init>(LD8/g;LD8/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LD8/p$a;->b:LD8/q;

    .line 18
    .line 19
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
.method public final a()LD8/q;
    .locals 1

    .line 1
    sget-object v0, LD8/p$a;->b:LD8/q;

    .line 2
    .line 3
    return-object v0
.end method
