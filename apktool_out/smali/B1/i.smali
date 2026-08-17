.class public interface abstract LB1/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LB1/i;

.field public static final b:LB1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB1/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, LB1/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB1/i;->a:LB1/i;

    .line 7
    .line 8
    new-instance v0, LB1/k$a;

    .line 9
    .line 10
    invoke-direct {v0}, LB1/k$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LB1/k$a;->c()LB1/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LB1/i;->b:LB1/i;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
