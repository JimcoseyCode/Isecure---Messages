.class final Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "DispatchEventsRunnable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;",
        "Ljava/lang/Runnable;",
        "<init>",
        "(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V",
        "Li7/B;",
        "run",
        "()V",
        "ReactAndroid_release"
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
.field final synthetic this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    const-string v0, "DispatchEventsRunnable"

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v0}, LB3/a;->c(JLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v0, "ScheduleDispatchFrameCallback"

    .line 9
    .line 10
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 11
    .line 12
    invoke-static {v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getHasDispatchScheduledCount$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v1, v2, v0, v3}, LB3/a;->f(JLjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v0, v3}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$setHasDispatchScheduled$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatchLock$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 36
    .line 37
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatchSize$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-lez v5, :cond_3

    .line 43
    .line 44
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatchSize$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-le v5, v6, :cond_0

    .line 50
    .line 51
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatch$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatchSize$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-static {}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEVENT_COMPARATOR$cp()Ljava/util/Comparator;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v5, v3, v6, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v3

    .line 68
    goto :goto_4

    .line 69
    :cond_0
    :goto_0
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatchSize$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    :goto_1
    if-ge v3, v5, :cond_2

    .line 74
    .line 75
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventsToDispatch$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)[Lcom/facebook/react/uimanager/events/Event;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    aget-object v6, v6, v3

    .line 80
    .line 81
    if-nez v6, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/events/Event;->getEventName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/events/Event;->getUniqueID()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-static {v1, v2, v7, v8}, LB3/a;->f(JLjava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getReactEventEmitter$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Lcom/facebook/react/uimanager/events/EventEmitterImpl;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/events/Event;->dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/events/Event;->dispose()V

    .line 103
    .line 104
    .line 105
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$clearEventsToDispatch(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v4}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getEventCookieToLastEventIdx$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Landroid/util/LongSparseArray;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Landroid/util/LongSparseArray;->clear()V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget-object v3, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    :try_start_2
    monitor-exit v0

    .line 121
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$DispatchEventsRunnable;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$getPostEventDispatchListeners$p(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v3, "iterator(...)"

    .line 132
    .line 133
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_4

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;

    .line 147
    .line 148
    invoke-interface {v3}, Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;->onBatchEventDispatched()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_5

    .line 154
    :cond_4
    invoke-static {v1, v2}, LB3/a;->i(J)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_4
    :try_start_3
    monitor-exit v0

    .line 159
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 160
    :goto_5
    invoke-static {v1, v2}, LB3/a;->i(J)V

    .line 161
    .line 162
    .line 163
    throw v0
.end method
