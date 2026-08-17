.class public LB1/w;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB1/w$b;,
        LB1/w$a;
    }
.end annotation


# static fields
.field private static final a:LB1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB1/w;

    .line 2
    .line 3
    invoke-direct {v0}, LB1/w;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB1/w;->a:LB1/w;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LB1/w;
    .locals 1

    .line 1
    sget-object v0, LB1/w;->a:LB1/w;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public buildLoadData(Ljava/lang/Object;IILv1/h;)LB1/n$a;
    .locals 0

    .line 1
    new-instance p2, LB1/n$a;

    .line 2
    .line 3
    new-instance p3, LP1/c;

    .line 4
    .line 5
    invoke-direct {p3, p1}, LP1/c;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, LB1/w$b;

    .line 9
    .line 10
    invoke-direct {p4, p1}, LB1/w$b;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p3, p4}, LB1/n$a;-><init>(Lv1/f;Lcom/bumptech/glide/load/data/d;)V

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public handles(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
